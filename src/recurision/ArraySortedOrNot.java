package recurision;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 5, 5};
        System.out.println(help(a, a.length - 1));
    }

    private static boolean help(int[] a, int n){
        if(n == 0)
            return true;
        return (a[n] < a[n - 1]) ? false : help(a, n - 1); 
    }
}
