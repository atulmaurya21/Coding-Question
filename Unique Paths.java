class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1)
         return 1;

        int cache[][]=new int[m+1][n+1];
        for(int a[]:cache)
         Arrays.fill(a,-1);

        return paths(m-1,n-1,cache);
    }
    int paths(int m,int n,int cache[][])
    {
        if(cache[m][n] != -1)
         return cache[m][n];
        if(m==0 && n==0)
         cache[m][n]=0;
        else if (m==0 || n==0)
         cache[m][n]=1;
        else
          cache[m][n]=paths(m-1,n,cache)+paths(m,n-1,cache);
        return cache[m][n];
    }
}