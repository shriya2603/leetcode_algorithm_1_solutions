// Link - https://leetcode.com/problems/max-area-of-island/
// Time Complexity: O(n^2) ,Space Complexity: O(1)
class Solution {
    public int check(int[][] grid,int i,int j){
        int ans=1;
        if(i >= 0 && j >= 0 && i < grid.length && j < grid[i].length && grid[i][j] == 1){
            grid[i][j]=0;
            ans+=check(grid,i+1,j);
            ans+=check(grid,i-1,j);
            ans+=check(grid,i,j+1);
            ans+=check(grid,i,j-1);
            return ans;
        }
        else return 0;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int count=0;
                if(grid[i][j]==1){
                    count=check(grid,i,j);
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
}