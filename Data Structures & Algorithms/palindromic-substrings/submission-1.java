class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j)&&((i-j<=2) ||                dp[j+1][i-1]))
                {
                    dp[j][i]=true;
                  count++;
                }
            }
        }
        return count+s.length();
    }
}
