package sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5, 6, 3, 9, 0, 2, 1, 4, 8, 7};
        mergeSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
        }

    private static void mergeSort(int[] a, int low, int high) {
        if(low < high) {
            int mid = (low + high) >>> 1;

            mergeSort(a, low, mid);

            mergeSort(a, mid + 1, high);
            
            merge(a, low, mid, high);
        }
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if(a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        while (right <= high) {
            temp.add(a[right]);
            right++;
        }
        for(int i = low; i <= high; i++)
            a[i] = temp.get(i - low);
    }   

}
