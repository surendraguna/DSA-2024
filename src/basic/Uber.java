package basic;

public class Uber {
    public static void main(String[] args) {
        String[] s = {"Hire", "Me", "Uber"};
        String s1 = "HMU";
        System.out.println(findMatch(s, s1));
    }

    private static boolean findMatch(String[] s, String s1) {
        if(s.length != s1.length())
            return false;
        for(int i = 0; i < s.length; i++){
            if (s[i].charAt(i) != s1.charAt(i))
                return false;
        }
        return true;
    }
}
