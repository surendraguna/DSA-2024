package array;

public class PreAndSufMul {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int ans[] = new int[a.length];
        int pre = 1;
        for(int i = 0; i < a.length; i++){
            ans[i] = pre;
            pre *= a[i];
        }
        int suf = 1;
        for(int i = a.length - 1; i >=  0; i--){
            ans[i] = ans[i] * suf;
            suf *= a[i];
        }
        for (int i : ans) {
            System.out.print(i + " "); 
        }
    }
}
