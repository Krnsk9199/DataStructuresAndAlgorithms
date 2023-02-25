package Strings;

import java.util.Stack;

public class NextGreateElement {
    public static int[] nextGreater(int [] arr, int n){
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i =0; i<n; i++){
            if(stack.size()==0){
                stack.push(i);
                continue;
            }

            while(stack.size()>0 && arr[i]> arr[stack.peek()] ){
                ans[stack.pop()] = arr[i];
            }

            stack.push(i);

        }

        while(stack.size()>0){
            ans[stack.pop()] = -1;
        }

        return ans;
    }
    public static int[] nextGreater1(int[] arr, int n) {

        int NGE[] = new int[n];
        for(int i=0; i<n; i++){
            NGE[i] = -1;
        }
        for(int i=0; i<n; i++){

            for(int j =i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    NGE[i] = arr[j];
                    break;
                }
            }

        }

        return NGE;

    }
}
