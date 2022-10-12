package Strings;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
       System.out.println(LongestSubString(str));
    }
    public static Integer LongestSubString(String s){
         boolean [] exist = new boolean[256];
         int i = 0, maxLen = 0;
         for( int j =0; j<s.length(); j++){
             while(exist[s.charAt(j)]){
                 exist[s.charAt(i)]=false;
                 i++;
             }
             exist[s.charAt(j)]=true;
             maxLen = Math.max(j-i+1, maxLen);
         }
         return maxLen;
    }
}
