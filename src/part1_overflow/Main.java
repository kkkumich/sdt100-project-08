package part1_overflow;

public class Main {
    static void noBaseCase() { noBaseCase(); }
    public static void main(String[] args) {
        // Deliberate, isolated demonstration. Never use this algorithm in real code.
        try { noBaseCase(); }
        catch(StackOverflowError e) { System.out.println("Expected demonstration: "+e); }
    }
}
