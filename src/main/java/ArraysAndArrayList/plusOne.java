package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list =new ArrayList<>();
        for(int i =0; i<n; i++){
            list.add(s.nextInt());
        }
        plusOne(list);
        for(Integer i :list){
            System.out.print(i+" ");
        }


    }

    public static void plusOne(List<Integer> digits){
        for(int i=digits.size()-1; i>=0; i--){
            int digit = digits.get(i);
            if(digit<9){
                digits.set(i,digit+1);
                return;
            }
            else {
                digits.set(i,0);
            }
        }
        digits.add(0);
        digits.set(0,1);
    }
}
