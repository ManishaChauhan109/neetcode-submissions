class Solution {
    public int[] dp1;
    public int[] dp2;
     public int f(ArrayList<Integer> nums,int idx,int[] dp)
    {
        if(idx<0)
        {
            return 0;
        }
        if(idx==0)
        {
            return nums.get(0);
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int take=nums.get(idx)+f(nums,idx-2,dp);
        System.out.println(take);
        int nottake=0+f(nums,idx-1,dp);
        System.out.println(nottake);
        dp[idx]=Math.max(take,nottake);
        System.out.println(idx+":"+dp[idx]);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> temp1=new ArrayList<>();
        ArrayList<Integer> temp2=new ArrayList<>();
        if(n==1)
        {
            return nums[0];
        }
       
        for(int i=0;i<n;i++)
        {
            if(i!=0)
            {
                temp1.add(nums[i]);
                
            }
            if(i!=n-1)
            {
                temp2.add(nums[i]);
            }
        }
        if(temp1.size()==1 && temp2.size()==1)
        {
            return Math.max(temp1.get(0),temp2.get(0));
        }
        else{
        dp1=new int[temp1.size()];
        Arrays.fill(dp1,-1);
        int res1=f(temp1,temp1.size()-1,dp1);
        dp2=new int[temp2.size()];
        Arrays.fill(dp2,-1);
        int res2=f(temp2,temp2.size()-1,dp2);
        return Math.max(res1,res2);
        }

    }
}
