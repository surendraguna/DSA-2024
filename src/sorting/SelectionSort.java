package sorting;


public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 1, 6, 4, 2, 3};
        for(int i = 0; i < a.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[min])
                    min = j;
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

