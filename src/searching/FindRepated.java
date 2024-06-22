package searching;

public class FindRepated {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 2, 3, 1, 3, 4, 5};
        for(int i = 0; i < a.length; i++){
            int ind = Math.abs(a[i]);

            if(a[ind] < 0)
                System.out.print(Math.abs(a[i]) + " ");
            else
                a[ind] = -a[ind];
        }
    }
}
