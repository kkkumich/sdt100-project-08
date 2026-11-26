package part3_recursive_strings;

public class Main {
    public static void printString(String s) { if(s.isEmpty()) return; System.out.println(s.charAt(0)); printString(s.substring(1)); }
    public static void printReverseString(String s) { if(s.isEmpty()) return; printReverseString(s.substring(1)); System.out.println(s.charAt(0)); }
    public static String reverseString(String s) { return s.isEmpty()?"":reverseString(s.substring(1))+s.charAt(0); }
    public static void main(String[] args) { printString("Java"); printReverseString("Java"); System.out.println(reverseString("Java")); }
}
