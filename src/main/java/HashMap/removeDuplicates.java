package HashMap;

import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

  class removeDuplicates {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Integer [] arr = new Integer[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        ArrayList x = removeDuplicates.removeDuplicates(arr);
        for(Object k : x){
            System.out.print(k+" ");
        };
    }
    public  static ArrayList<Integer> removeDuplicates(Integer arr[]){
        ArrayList<Integer> output = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>() ;
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i],true);
        }
        return output;
    }


}
