package DynamicProgramming;

public class KnapSackProblem {

    public static void main(String args[]){

        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int W = 50;
        int N = value.length;
        int dp[][] = new int[N+1][W+1];
        for(int i = 0; i < N + 1; i++){
            for(int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }

        /**
         *
         * find out the maximum value subset of val[] such that sum of the weights of this subset
         * is smaller than or equal to W
         */
        System.out.println(knapSack( weight, value,W, value.length));
        System.out.print(knapSack(W,weight,value,value.length,dp));
    }

    public static int knapSack(int weights[] ,int values[], int W , int n){

        if(n == 0 || W == 0)
        {
            return 0;
        }
        if(weights[n-1]>W){
         return knapSack(weights,values,W,n-1);
        }
        return Math.max(knapSack(weights,values,W,n-1),
                    values[n-1]+knapSack(weights,values,W-weights[n-1],n-1));



    }
    public static int knapSack(int W,int wt[], int val[], int n, int dp[][]){

        if(n==0||W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]>W){
            dp[n][W] =knapSack(W,wt,val,n-1,dp);
            return dp[n][W];
        }

        dp[n][W] = Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1,dp),
                knapSack(W,wt,val,n-1,dp));
        return dp[n][W];
    }
}
