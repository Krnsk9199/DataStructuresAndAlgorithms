package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int[] arr = new int[n];
        for (int i= 0; i<n; i++){

            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.print(searchFast(arr,x));

    }

    public static Integer searchFast(int[] arr , int x){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]>x){
                end = mid-1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
        }
        return -1;

    }
}
