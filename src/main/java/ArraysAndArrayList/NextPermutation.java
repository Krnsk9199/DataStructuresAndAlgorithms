package ArraysAndArrayList;

import java.util.*;
public class NextPermutation {

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        nextPermutation(list);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr)
    {
        int n = arr.size();
        int i ,j;
        for( i = n-2; i>=0; i--){
            if(arr.get(i)<arr.get(i+1)){
                break ;
            }
        }

        if(i<0){
            reverse(arr,0,arr.size()-1);
            return arr;
        }

        for( j = n-1; j>i; j--){
            if(arr.get(j)>arr.get(i)){
                break ;
            }
        }

        Collections.swap(arr,i,j);
        reverse(arr,i+1,arr.size()-1);
        return arr;

    }

    public static void reverse(ArrayList<Integer> arr, int start , int end)
    {
        while(start<end){
            Collections.swap(arr,start,end);
            start++;
            end--;
        }

    }
}
