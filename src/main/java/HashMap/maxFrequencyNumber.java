package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxFrequencyNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Integer [] arr = new Integer[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        System.out.print(maxFrequencyNumber.maxFrequencyNumber(arr));
    }

    public static int maxFrequencyNumber(Integer []arr){
        Map<Integer, Integer > h = new HashMap<>();
        for(Integer x :arr){
            if(h.containsKey(x)){
                h.put(x,h.get(x)+1);
            }
            else{
                h.put(x,1);
            }
        }
        int max =0;
        int maxKey = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(h.get(arr[i])>max){
                max = h.get(arr[i]);
                maxKey = arr[i];
            }
        }
        return maxKey;
    }
}
