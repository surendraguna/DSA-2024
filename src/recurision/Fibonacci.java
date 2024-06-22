package recurision;

public class Fibonacci {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            System.out.print(help(i) + " ");
    }

    private static int help(int n) {
        if(n <= 1)
            return n;
        return help(n - 2) + help(n - 1);
    }
    
}
