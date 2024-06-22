package array;

public class PreAndSufix {
    private static int[] pre;
    private static int[] suf;
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 3, 5, 9, 7, 6, 8};
        findMax(a, 1, 5);
        findMax(a, 6, 7);
        findMax(a, 4, 7);
        System.out.println();
        pre = new int[a.length];
        pre[0] = a[0];
        for(int i = 1; i < a.length; i++)
            pre[i] = Math.max(pre[i - 1], a[i]);
        suf = new int[a.length];
        suf[a.length - 1] = a[a.length - 1];
        for(int i = a.length - 2; i >= 0; i--)
            suf[i] = Math.max(suf[i + 1], a[i]);
        findMaxOptimal(1, 5);
        findMaxOptimal(6, 7);
        findMaxOptimal(4, 7);
    }

    private static void findMaxOptimal(int l, int r) {
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        if(l > 0)
            leftMax = Math.max(leftMax, pre[l - 1]);
        if(r < suf.length - 1) {
            rightMax = Math.max(rightMax, suf[r + 1]);
        }
        System.out.print(Math.max(leftMax, rightMax) + " ");
    }

    private static void findMax(int[] a, int l, int r) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            if ((i < l || i > r) && max < a[i]) 
                max = a[i];
        }
        System.out.print(max + " ");
    } 
}
