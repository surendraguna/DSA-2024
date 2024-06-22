package searching;

public class FindSqrt {
    public static void main(String[] args) {
        int x = 10;
        double l = 0, r = x, ans = 0;
        double delta = 1e-10; // le-6
        while (l + delta <= r) {
            double m = (l + r) / 2;  
            if(m * m <= x){
                ans = m;
                l = m;
            } else 
                r = m;
        }
        System.out.println(ans);
        System.out.println(find(10));
    }

    private static double find(int x) {
        double l = 0, r = x;
        double delta = 1e-10; // le-6
        while ((r - l) > delta) {
            double m = (l + r) / 2;  
            if(m * m <= x){
                l = m;
            } else 
                r = m;
        }
        return Double.parseDouble(String.format("%.10f", l));
    }
}
