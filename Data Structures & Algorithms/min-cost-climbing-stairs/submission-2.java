class Solution {
    // public int[] dp;
    // public int f(int[] cost,int i)
    // {
    //     int n=cost.length;
    //     dp=new int[n+1];
    //     if(i==0)
    //     {
    //         dp[0]=cost[0];
    //         dp[1]=cost[1]+cost[0];
    //     }
    //     else
    //     {
    //         dp[]
    //     }
    // //     if(i>=n)
    // //     {
    // //         return 0;
    // //     }
    // //     if(dp[i]!=-1)
    // //     {
    // //          return dp[i];
    // //     }
    // //     int one=f(cost,i+1)+cost[i];
    // //     int two=f(cost,i+2)+cost[i];
    // //     dp[i]=Math.min(one,two);
    // //     return dp[i];
    // }
    public int minCostClimbingStairs(int[] cost) {
        // int zero=f(cost,0);
        // int one=f(cost,1);
        // return Math.min(zero,one);
       int n = cost.length;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1],
                             dp[i - 2] + cost[i - 2]);
        }

        return dp[n];
      
        


    }
}
