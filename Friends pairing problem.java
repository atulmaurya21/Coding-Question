class Solution
{
    long M = 1000000007;
    public long countFriendsPairings(int n) 
    { 
       //code here
        long dp[]=new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=n; i++)
        {
            long single= dp[i-1]%M;
            long paired= (i-1)*dp[i-2]%M;
            dp[i] =(single+paired)%M;
        }
        
        return dp[n];
    }
}    
 