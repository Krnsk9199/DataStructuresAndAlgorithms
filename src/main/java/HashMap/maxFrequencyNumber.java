package HashMap;

import java.util.ArrayList;
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


    }
}
