package recurision;

public class TowerOfHanoi {
    public static void main(String[] args) {
        char source = 'A';
        char destination = 'C';
        char aux = 'B';
        int n = 4; // number of disks
        help(n, source, destination, aux);
    }

    private static void help(int n, char s, char d, char a) {
        if(n == 0)
            return;
        help(n-1, s, a, d);
        System.out.println("Move disk " + n + " from rod " + s + " to " + d);
        help(n - 1, a, d, s);
    }
}
