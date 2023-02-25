package Strings;
import java.util.*;

public class AllAnagrams {

    public static void main(String [] args){
        String s1 = "BHBHKBHBH";
        String s2 = "BH";
        List<Integer> list = findAnagramsIndices(s1, s1.length(),s2,s2.length());
        for(Integer i : list){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m)
    {
        if(m==1){
            ArrayList<Integer> output = new ArrayList<>();
            for(int i =0; i<n;i++){
                if(str.charAt(i)==ptr.charAt(0)){
                    output.add(i);
                }
            }
            return output;
        }

        Map<Integer,char []> map = new LinkedHashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        char[] requiredCharArray = ptr.toCharArray();
        Arrays.sort(requiredCharArray);
        for(int i =0; i<n;i++){
            if(i+m<=n){
                String s = str.substring(i,i+m);
                char[] sArray = s.toCharArray();
                Arrays.sort(sArray);
                if(Arrays.equals(sArray
                        ,requiredCharArray))
                {
                    map.put(i,sArray);
                    output.add(i);
                }

            }
        }

        return output;
    }

}