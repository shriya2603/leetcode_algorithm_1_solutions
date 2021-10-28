// Link - https://leetcode.com/problems/climbing-stairs/
class Solution {
    public int climbStairs(int n) {
        if(n<0) return 0;
        else if(n==1) return 1;
        else{
            int ans[]= new int[n+1];
            ans[0]=1;
            ans[1]=1;
            ans[2]=2;
            for(int i=3;i<=n;i++){
                ans[i]=0;
                for(int j=1;j<=2;j++){
                    ans[i]+=ans[i-j];
                }
            }
            return ans[n];
        }
    }
}