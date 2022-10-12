package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordByWord {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        reverseWordByWord(str);
    }

    public static void reverseWordByWord(String s){
        String[] stringArray = s.split(" ");
        String[] output = new String[stringArray.length ];

        int j=0;
        int i = stringArray.length;
        while(i>0){
            output[j] = stringArray[i-1];
            i--;
            j++;
        }

         Arrays.stream(output).forEach(e->System.out.print(e+" "));



    }
}
