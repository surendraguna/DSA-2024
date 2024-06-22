package basic;
public class IntegerToRoman {
    
    public static String intToRoman(int num) {
        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        
        StringBuilder roman = new StringBuilder();
        
        for (int i = values.length - 1; i >= 0; i--) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanNumerals[i]);
            }
        }
        
        return roman.toString();
    }
    
    public static void main(String[] args) {
        int num = 354;
        System.out.println(intToRoman(num)); // Output: CCCLIV
    }
}
