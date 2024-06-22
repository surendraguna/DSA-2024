package recurision;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(help(s, 0, s.length() - 1));
    }

    private static boolean help(String s, int l, int r) {
        if(l >= r)
            return true;
        if(s.charAt(l) != s.charAt(r))
            return false;
        return help(s, l+1, r-1);
    }
}
