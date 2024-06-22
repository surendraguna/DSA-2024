package searching;


public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 8};
        int l = 0, r = a.length - 1;
        int key = 7;
        boolean flag = false;
        while (l <= r) {
            int mid = (l + r) >>> 1; // or (l + r) / 2
            if(a[mid] == key) {
                flag = true;
                System.out.println("Found " + mid);
                break;
            } else if (a[mid] > key)
                r = mid - 1;
            else 
                l = mid + 1;
        }
        if(!flag)
            System.out.println("Not Found");
        System.out.println(binaryRec(a, 0, a.length - 1, key));
    }

    private static boolean binaryRec(int[] a, int l, int r, int k) {
        if(l > r)
            return false;
        int m = (l + r) >>> 1;
        if(a[m] == k)
            return true;
        else if (a[m] < k)
            return binaryRec(a, m + 1, r, k);
        else
            return binaryRec(a, l, m - 1, k);
    }
}
