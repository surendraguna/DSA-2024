package basic;

class RotateMat {
    public static void main(String[] args) {
        // int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = new int[a.length][a[0].length];
        int n = a.length;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++)
                b[j][n - i - 1] = a[i][j];
        for (int[] i : b) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        transpose(a);
        reverse(a);
        for (int[] i : a) {
            for(int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    private static void reverse(int[][] a) {
        for(int i = 0; i < a.length; i++){
            int l = 0, r = a[i].length - 1;
            while (l < r) {
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    private static void transpose(int[][] mat) {
        for(int i = 0; i < mat.length - 1; i++)
            for(int j = i + 1; j < mat.length; j++)
                swap(mat, i, j);
    }

    private static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}