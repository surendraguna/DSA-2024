package basic;

public class Gcd {
    public static void main(String[] args) {
        int n1 = 20, n2 = 40;
        int res = 1;
        for(int i = 2; i <= Math.min(n1, n2); i++){
            if (n1 % i == 0 && n2 % i == 0)
                res = i;
        }
        System.out.println(res);
        res = 1;
        for(int i = Math.max(n2, n1); i > 1; i--){
            if (n1 % i == 0 && n2 % i == 0) {
                res = i;
                break;
            }
        }
        System.out.println(res);
        System.out.println(gcd(52, 10));
        System.out.println(gcdRec(52, 10));
        System.out.println(gcdRec1(18, 48));
        System.out.println(gcdRec1(48, 18));
    }
    private static int gcdRec1(int i, int j) {
        if(j == 0)
            return i;
        return gcdRec1(j, i%j);
    }
    private static int gcdRec(int i, int j) {
        if(i == 0 ||  j == 0)  
            return Math.max(i, j);
        return (i > j) ? gcdRec(i%j, j) : gcdRec(i, j%i);
    }
    private static int gcd (int a, int b){
        while (a > 0 && b > 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        return Math.max(a, b);
    }
}
