package basic;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("-----------------");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("-----------------");
        n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println("-----------------");
        for(int i = n; i > 0; i--){
            for(int j = 0; j <= n - i - 1; j++)
                System.out.print(" ");
            for(int j = 2 * i - 1; j > 0; j--)
                System.out.print(j);
            for(int j = 0; j <= n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println("-----------------");
        n = 10;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || j == n-1 || i == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
