package basic;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "sure";
        String s2 = new String("sure");
        String s3 = "sure";
        if(s1 == s2)
            System.out.println("s1 == s2");
        else 
            System.out.println("s1 != s2");
        if(s1 == s3)
            System.out.println("s1 == s3");
        else 
            System.out.println("s1 != s3");
    }
}
