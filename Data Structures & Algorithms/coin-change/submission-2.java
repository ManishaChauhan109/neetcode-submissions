class Solution {
   public int solve(int[] coins,int amount,int[] dp)
   {
    if(amount==0)
    {
        return 0;
    }
    if(dp[amount]!=-1)
    {
        return dp[amount];
    }
    int mincoin=Integer.MAX_VALUE;
    for(int coin:coins)
    {
        if(coin<=amount)
        {
        int result=solve(coins,amount-coin,dp);
        if(result!=Integer.MAX_VALUE)
        {
            mincoin=Math.min(mincoin,result+1);
        }
        }
    }
    dp[amount]=mincoin;
    return mincoin;
   }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=solve(coins,amount,dp);

        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }  
        return ans;
    }
}
