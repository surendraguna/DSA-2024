package basic;

public class SortedAndRotated {
    public static void main(String[] args) {
        int c = 0;
        int a[] = {3, 4, 5, 1, 2};
        for(int i = 0; i < a.length; i++)
            if(a[i] > a[(i + 1) % a.length])
                c++;
        System.out.println((c < 2) ? "yes" : "no");
    }
}
