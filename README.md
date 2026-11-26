# Project 8. Recursion

Canvas: https://auk.instructure.com/courses/1274/assignments/33049

## Состав

- `part1_recursion.Main`
- `part1_overflow.Main`
- `part2_recursive_arrays.Main`
- `part3_recursive_strings.Main`

## Запуск

Требуется JDK 21. В IntelliJ: открыть проект, выбрать JDK, отметить src как Sources Root. Каждая часть запускается своим main. Рабочая папка — корень этого проекта.

Из PowerShell:

```powershell
$sourceFiles = @(Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName)
javac -encoding UTF-8 -d build @sourceFiles
java -cp build part1_recursion.Main
java -cp build part1_overflow.Main
java -cp build part2_recursive_arrays.Main
java -cp build part3_recursive_strings.Main
```

## Что показать на защите

Для n=9 покажи прямой и обратный порядок, затем изолированный StackOverflowError, сумму массива, число совпадений и рекурсивные операции со строками.

## Как объяснить

Рекурсивный метод вызывает себя для меньшей задачи. Базовый случай останавливает цепочку вызовов. Печать до рекурсивного вызова даёт обратный отсчёт, после вызова — возрастающий порядок. Каждый незавершённый вызов занимает кадр стека.

## Возможные вопросы

- **Почему возникает StackOverflowError?** Без базового случая вызовы накапливаются до исчерпания стека.
- **Сложность обхода массива?** O(n) времени и O(n) глубины стека.
- **Почему reverseString с substring может быть O(n²)?** Создание подстрок и конкатенации на каждом уровне требуют копирования текста.

## Замечания

Намеренная рекурсия без базового случая вынесена отдельно. На больших данных итеративный алгоритм предпочтительнее из-за ограничения глубины стека.

Файл RUNS.txt содержит настоящие результаты локального запуска с демонстрационным вводом. Это журналы, а не скриншоты IntelliJ. Проверка выполнена 26 ноября 2026. Ошибочные учебные примеры находятся отдельно от src.
