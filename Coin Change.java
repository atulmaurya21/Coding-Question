class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
         return 0;
        int ans=cc(coins,amount,coins.length-1);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    int cc(int coins[], int amount, int i)
    {
        if(i<0 || amount<0)
         return Integer.MAX_VALUE;
        if(amount==0)
         return 0;
         
        int t=cc(coins, amount-coins[i], i);
        if(t != Integer.MAX_VALUE)
         t++;

        int nt=cc(coins,amount,i-1);
        
        return Math.min(t,nt);
    }
}