package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTABGCC";
        String s2 = "GXTXAYBBCC";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                LongestCommonSubsequence.lcs( X, Y, m, n ) );

    }

    private static int lcs(char[] x, char[] y, int m, int n) {
        if(m==0||n==0){
            return 0;
        }
        if(x[m-1]==y[n-1]){
            return 1 + lcs(x,y,m-1,n-1);
        }
        return Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
    }

    /**
     * Using Dynamic Programming
     * */
    private static int lcs(String x, String y, int m , int n ,int dp[][]){
        if(m==0||n==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
         if(x.charAt(m-1)==y.charAt(n-1)){
             dp[m][n] = 1+ lcs(x,y,m-1,n-1,dp);
             return dp[m][n];
         }
        dp[m][n]=Math.max(lcs(x,y,m-1,n,dp),lcs(x,y,m,n-1,dp));
        return dp[m][n];
    }


}
