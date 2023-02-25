package Strings;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String s1, String s2){

        if(s1.length()!=s2.length()) {
            return false;
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i =0;i<s1.length(); i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<s1.length(); i++){
           if( arr1[s1.charAt(i)-'a']!=arr2[s2.charAt(i)-'a']){
               return false;
           }
        }
        return true;
    }

    public static void main(String [] args){
        String s1 = "vtdnyyhijw";
        String s2 = "axkljjfxsn";

        System.out.println("================="+ areIsomorphic(s1,s2) + "=================");
    }
}
