package searching;

public class EkoEko {
    public static void main(String[] args) {
        int a[] = {20, 15, 10, 17};
        int max = Integer.MIN_VALUE, t = 7;
        for(int i : a)
            max = Math.max(max, i);
        int ans = -1;
        int l = 0, r = max;
        while (l <= r) {
            int m = (l + r) / 2;
            if(isPossible(a, m, t)) {
                ans = m;
                l = m + 1;
            } else{
                r = m - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isPossible(int[] a, int m, int t) {
        long coll = 0;
        for(int i : a)
            if(i > m)
                coll += i - m;
        return coll >= t;
    }
}
