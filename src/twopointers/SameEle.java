package twopointers;

import java.util.ArrayList;

public class SameEle {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 6};
        int b[]  = {3, 3, 5};
        int res[] = intersect(a, b);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    private static int[] intersect(final int[] a, final int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i, j;
        i = j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                arr.add(a[i]);
                i++;
                j++;
            } else {
                if(a[i] < b[j]){
                    i++;
                } else {
                    j++;
                }    
            }
        }
        int res[] = new int[arr.size()];
        for(i = 0; i < arr.size(); i++)
            res[i] = arr.get(i);
        return res;
    }
}
