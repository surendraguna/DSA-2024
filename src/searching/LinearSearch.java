package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6};
        int key = 4;
        boolean flag = true;
        for(int i = 0; i < a.length; i++){
            if(a[i] == key){
                System.out.println("found at " + i);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("not found");
        System.out.println(linearRec(a, 0, key));
    }

    private static int linearRec(int[] a, int i, int key) {
        if(i > a.length - 1)
            return -1;
        if(a[i] == key)
            return i;
        return linearRec(a, ++i, key);
    }
}
