package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[] {5, 4, 3, 2, 1};
        int b[] = Arrays.copyOf(a, a.length);
        int c[] = Arrays.copyOf(a, a.length);
        optimalBubbleSort(c);
        recBubbleSort(b, b.length);
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        int d[] = Arrays.copyOf(a, a.length);
        for(int i = a.length; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(d[j] > d[j+1]){
                    int temp = d[j+1];
                    d[j+1] = d[j];
                    d[j] = temp;
                }
            }
        }
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    private static void optimalBubbleSort(int[] c) {
        for(int i = 0; i < c.length; i++){
            boolean swap = false;
            for(int j = 0; j < c.length - i - 1; j++){
                if(c[j] > c[j + 1]){
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }

    private static void recBubbleSort(int[] a, int n) {
        if(n == 1)
            return;
        for(int i = 0; i < n - 1; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        recBubbleSort(a, n - 1);
    }
}
