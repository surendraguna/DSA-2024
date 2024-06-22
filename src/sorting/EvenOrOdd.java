package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a[] = {3, 8, 4, 9, 6, 2, 1, 5};
		mergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
    }
	private static void mergeSort(int[] a, int l, int r) {
        if(l < r){
            int m = (l + r) >>> 1;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }

    private static void merge(int[] a, int l, int m, int r) {
        ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		for(int i = l; i <= r; i++) 
			if((a[i] % 2) != 0) 
				odd.add(a[i]);
			else 
				even.add(a[i]);
		Collections.sort(odd);
		Collections.sort(even, Collections.reverseOrder());
		int i = l;
		for( ; i < odd.size(); i++)
			a[i] = odd.get(i- l);
		for(int j = 0; j < even.size(); j++)
			a[i++] = even.get(j);
    }
}
