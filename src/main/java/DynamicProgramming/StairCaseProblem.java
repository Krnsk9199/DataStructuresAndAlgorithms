package DynamicProgramming;

public class StairCaseProblem {
    public static void main(String []args){
        int s = 4, m = 2;
        System.out.println("Number of ways = "
                + countWays(s, m));
    }
    public static int countWaysUtil(int n, int m){
        if(n<=1)
            return n;
        int res = 0;
        for(int i=1; i<=m && i<=n; i++)
            res = res + countWaysUtil(n-i,m);
        return res;
    }
    public static int countWays(int n, int m){
        return countWaysUtil(n+1,m);
    }

    public static int countWaysDp(int n, int m ){
        return countWaysUtilDp(n+1,m);
    }
    private static int countWaysUtilDp(int n, int m) {
        int ways[] = new int[n];
        ways[0] = 1;
        ways[1] = 1;
     for(int i = 2; i<n; i++){
         ways[i] =0;
         for(int j=1; j<=m && j<=n; j++)
             ways[i] = ways[i] + ways[i-j];

     }
     return ways[n-1];

    }



}
