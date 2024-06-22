package searching;

public class RotatedOne {
    public static void main(String[] args) {
        int a[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int l = 0, r = a.length - 1;
        int t = 6;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if(a[m] == t){
                System.out.println(m);
                break;
            }

            if(a[l] <= a[m]){
                if(a[l] <= t && t <= a[m]){
                    r = m - 1;
                } else 
                    l = m + 1;
            } else {
                if(a[m] <= t && t <= a[r]){
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
    }
}
