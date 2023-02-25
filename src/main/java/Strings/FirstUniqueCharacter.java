package Strings;
import java.util.* ;
import java.io.*;
public class FirstUniqueCharacter {
    public static int firstUniqueCharacter(String s, int n) {

        Map<Character ,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        Character required = '0';
        for(Map.Entry<Character,Integer> i:map.entrySet()){
            if(i.getValue()==1){
                required = i.getKey();
                break;
            }
        }

        for(int i= 0; i<s.length(); i++ ){
            if(s.charAt(i)==required){
                return i+1;
            }
        }

        return -1;


    }
}
