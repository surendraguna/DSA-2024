package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {6, 3, 4, 1, 5, 2};
        for(int i = 1; i < a.length; i++){
            int key = a[i];
            int j = i;
            while (j > 0 && a[j-1] > key) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
         }

         for (int i : a) {
            System.out.print(i + " ");
         }
    }
}
