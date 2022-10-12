package DynamicProgramming;

import java.util.Scanner;



/**
 *   Kadane's Algorithm
 * */
public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(maxsubArraySum(arr));

    }
    public static int maxsubArraySum(int arr[]){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for( int i =0; i<arr.length; i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;
    }

}
