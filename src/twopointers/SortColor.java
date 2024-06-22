package twopointers;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int a[] = {2, 0, 1};
        int f = 0, l = a.length - 1;
        int i = 0;
        while(i <= l){
            if(a[i] == 0){
                int temp = a[i];
                a[i] = a[f];
                a[f] = temp;
                f++;
                i++;
            } else if (a[i] == 2){
                int temp = a[i];
                a[i] = a[l];
                a[l] = temp;
                l--;
            } else 
                i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
