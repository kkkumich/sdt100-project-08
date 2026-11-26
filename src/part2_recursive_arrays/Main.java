package part2_recursive_arrays;

public class Main {
    public static void printArray(int[] a,int i) { if(i>=a.length) return; System.out.print(a[i]+" "); printArray(a,i+1); }
    public static int arraySum(int[] a,int i) { return i>=a.length?0:Math.addExact(a[i],arraySum(a,i+1)); }
    public static int findCountInArray(int[] a,int what,int i) { return i>=a.length?0:(a[i]==what?1:0)+findCountInArray(a,what,i+1); }
    public static void main(String[] args) {
        int[] a={2,5,2,-1,2}; printArray(a,0); System.out.println();
        System.out.println("Sum: "+arraySum(a,0)); System.out.println("Count of 2: "+findCountInArray(a,2,0));
    }
}
