package ArraysAndArrayList;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String [ ] ars){
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();
        System.out.print( intToRoman(x));
    }

    private static final int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
    };
    private static final String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
    };
    public static String intToRoman(Integer num) {
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int k = num / values[i];
            for (int j = 0; j < k; j++) {
                roman.append(symbols[i]);
                num -= values[i];
            }
            i++;
        }
        return roman.toString();
    }
}
