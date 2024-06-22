package searching;

public class FindOddOccur {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 3, 1, 3};
        int res = 0;
        for(int i = 0; i < a.length; i++){
            res ^= a[i];
        }   
        System.out.println(res);
    }
}
