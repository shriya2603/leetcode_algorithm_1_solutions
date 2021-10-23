// Link - https://leetcode.com/problems/flood-fill/
// Time Complexity: O(n^2) ,Space Complexity: O(1)
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int original = image[sr][sc];
        return floodFillHelp(image, sr, sc, newColor, original);
    }
    public int[][] floodFillHelp(int[][] image, int sr, int sc, int newColor, int original) {
        int m = image.length;
        int n = image[0].length;
        if (sr < 0 || sr>= m || sc < 0 || sc >= n) return image;
        if(original == newColor) return image;

        image[sr][sc] = newColor;
        
        if(sc+1 < n && image[sr][sc+1] == original) floodFillHelp(image, sr, sc+1, newColor, original);
        if(sc-1 >= 0 && image[sr][sc-1] == original) floodFillHelp(image, sr, sc-1, newColor, original);
        if(sr-1 >= 0 && image[sr-1][sc] == original) floodFillHelp(image, sr-1, sc, newColor, original);
        if(sr+1 < m && image[sr+1][sc] == original) floodFillHelp(image, sr+1, sc, newColor, original);
        
        return image;
    }
}