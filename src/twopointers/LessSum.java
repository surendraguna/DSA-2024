package twopointers;

public class LessSum {
    public static void main(String[] args) {
        int a[] = {2, 5, 6};
        System.out.println(solve(a, 10));

    }
    private static int solve(int[] a, int b) {
        int ans = 0;
        int cs = 0;
        int i = 0;
        for(int j = 0; j < a.length; j++){
            cs += a[j];
            while(cs >= b){
                cs -= a[i];
                i++;
            }
            ans += (j - i + 1);
        }
        return ans;
    }
}
