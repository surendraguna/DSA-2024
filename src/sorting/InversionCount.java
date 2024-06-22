package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InversionCount {

    static long inversionCount(long a[])
    {
        return mergeSort(a, 0, a.length - 1);
    }

    private static long mergeSort(long[] a, long l, long r) {
        long count = 0, m;
        if(l < r){
            m = (l + r) >>> 1;
            count += mergeSort(a, l, m);
            count += mergeSort(a, m+1, r);
            count += merge(a, l, m, r);
        }
        return count;
    }

    private static long merge(long[] a, long l, long m, long r) {
        long left = l, right = m + 1, count = 0;
        ArrayList<Long> temp = new ArrayList<>();
        while (left <= m && right <= r) 
            if(a[(int)left] <= a[(int)right])
                temp.add(a[(int)left++]);
            else {
                temp.add(a[(int)right++]);
                count += (m + 1) - left;
            }
        while (left <= m)
            temp.add(a[(int)left++]);
        while (right <= r) 
            temp.add(a[(int)right++]);
        for(long i = l; i <= r; i++)
            a[(int)i] = temp.get((int) (i - l));
        return count;
    }

    public static void main(String[] args) {
        long a[] = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(a));
        System.out.println(Arrays.toString(a));
    }
}
