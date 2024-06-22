package algorithm;

public class MaximumProduct {
    public static void main(String[] args) {
        int a[] = {2, 3, -2, 4, -5};
        System.out.println(maxProduct(a));
    }

    private static int maxProduct(int[] a) {
        int res, max, min;
        res = max = min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(a[i], a[i] * max);
            min = Math.min(a[i], a[i] * min);
            res = Math.max(res, max);
        }
        return res;
    }
}
