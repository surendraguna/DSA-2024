package recurision;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(help(6));
    }
    private static int help(int n){
        if(n <= 1)
            return n;
        return n * help(n - 1);
    }
}
