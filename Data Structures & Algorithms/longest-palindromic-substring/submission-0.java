class Solution {
    public String longestPalindrome(String s) {
        int maxLen=1;
        int start=0;
        int end=0;
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++)
        { 
            dp[i][i]=true;
            for(int j=0;j<i;j++)
            {  
             if (s.charAt(j) == s.charAt(i) && 
            (i-j <= 2 || dp[j+1][i - 1]))
            {
                    dp[j][i]=true;
                    if(maxLen<i-j+1)
                    {
                        maxLen=i-j+1;
                        start=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
