// Link - https://leetcode.com/problems/triangle/
class Solution {
    
    public List<List<Integer>> t;
    Integer [][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        t=triangle;
        dp=new Integer[t.size()][t.size()];
        for(Integer [] x: dp)
            Arrays.fill(x, -1);
        return solve(t.get(0), 0, 0);
    }
    
    private Integer solve(List<Integer> ls, int i, int x)
    {
        
        if(x==t.size()-1)
            return ls.get(i);
        
        if(dp[x][i]!=-1)
            return dp[x][i];

        return dp[x][i]=ls.get(i)+Math.min(solve(t.get(x+1), i, x+1),solve(t.get(x+1), i+1, x+1));
        
        
    }
}