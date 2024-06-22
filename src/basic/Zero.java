package basic;

import java.util.Scanner;

class Zero{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = 8;
        int[] a = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        // for(int i = 0; i < n; i++){
        //     a[i] = s.nextInt();
        // }
        int res = 0;
        for(int i = 0; i < n; i++){
            int len = 0;
            for(int j = i; j < n; j++){
                len += a[j];
                if(len == 0) {
                    res = (res > j - i + 1) ? res : j - i + 1;
                }
            }
        }
        System.out.println(res);
        s.close();
    }
}