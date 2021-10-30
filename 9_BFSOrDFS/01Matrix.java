// Link - https://leetcode.com/problems/01-matrix/
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++) {
                
                if (mat[i][j] == 0) {       //catch all zero
                    queue.add(new int[]{i,j});
                }
                else {
                    mat[i][j] = -1;     //making "1" unvisited  for bfs
                }
            }
        }
        //BFS
        int level = 0;
        while (!queue.isEmpty()) {
            level++; 
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                
                int[] curPos = queue.poll(); //get cell
                int curRow = curPos[0];
                int curCol = curPos[1];
                
                if (curRow +1 < mat.length) {  //down
                    
                    if(mat[curRow +1][curCol]== -1){    //-1 means unvisited
                       mat[curRow +1][curCol] = level;
                       queue.add(new int[]{curRow +1, curCol}); //now this will act like virtual zero for next level
                    }
                }
                if (curRow -1 >= 0) {    //up
                    
                    if(mat[curRow -1][curCol] == -1) {
                        mat[curRow -1][curCol] = level;
                        queue.add(new int[]{curRow -1, curCol});

                    }
                }
                if (curCol +1 < mat[0].length) {   //right
                    if(mat[curRow][curCol+1] == -1) {
                       mat[curRow][curCol+1] = level;
                       queue.add(new int[]{curRow, curCol+1}); 
                    }
                    
                }
                if (curCol -1 >= 0) {    //left
                    if(mat[curRow][curCol-1] == -1){
                       mat[curRow][curCol-1] = level;
                       queue.add(new int[]{curRow, curCol-1}); 
                    }  
                } 
            }
        }
        return mat;
    }
}