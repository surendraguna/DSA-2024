package recurision;

public class ReverseOfArray {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 4, 5};
        help(a, a.length - 1);
    }

    private static void help(int[] a, int n) {
        if(n < 0)
            return;
        System.out.print(a[n] + " ");
        help(a, --n);
    }

}
