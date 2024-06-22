package algorithm;

// using kadane's algorithm

public class MaxSubArraySum {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int res = Integer.MIN_VALUE;
        int cSum = 0;
        for(int i = 1; i < a.length; i++){
            cSum += a[i];
            if(cSum < a[i] || cSum < 0)
                cSum = a[i];
            res = Math.max(cSum, res);
        }
        System.out.println(res);
        System.out.println(withIndex(a));
    }

    private static String withIndex(int[] a) {
        int c = 0;
        int s, e, t;
        s = e = t = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            c += a[i];
            if(c < a[i]) {
                c = a[i];
                t = e = i;
            }

            if(res < c){
                res = c;
                s = t;
                e = i;
            }

            if(c < 0){
                c = a[i];
                t = i + 1;
            }
        }

        return res + " " + s + " " + e;
    }
}
