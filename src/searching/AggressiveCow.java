package searching;

import java.util.Arrays;

public class AggressiveCow {
    public static void main(String[] args) {
        int s[] = {1, 2, 8, 4, 9};
        int c = 3;
        int ans = -1;
        Arrays.sort(s);
        int l = 0, r = s[s.length - 1];
        while (l <= r) {
            int m = (l + r) >>> 1;
            if(isPossible(s, c, m)){
                ans = m;
                l = m + 1;
            } else
                r = m - 1;  
        }
        System.out.println(ans);
    }

    private static boolean isPossible(int[] s, int c, int m) {
        int pre = s[0];
        int cowsPlaced = 1;
        for(int i = 1; i < s.length; i++){
            if(s[i] - pre >= m){
                cowsPlaced++;
                pre = s[i];
            }
        }
        return cowsPlaced >= c;
    }
}
