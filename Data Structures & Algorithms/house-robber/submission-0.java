class Solution {
    public int[] dp;
    public int f(int[] nums,int idx,int[] dp)
    {
        if(idx<0)
        {
            return 0;
        }
        if(idx==0)
        {
            return nums[0];
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int take=nums[idx]+f(nums,idx-2,dp);
        int nottake=0+f(nums,idx-1,dp);
        dp[idx]=Math.max(take,nottake);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=f(nums,n-1,dp);
        return res;

    }
}
