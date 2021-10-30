// Link - https://leetcode.com/problems/rotting-oranges/
class Node{
    int t,x,y;
    Node(int t,int x,int y){
        this.t=t;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Node> queue = new LinkedList<Node>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    Node node=new Node(0,i,j);
                    queue.add(node);
                }
            }
        }
        int time =0;
        while(!queue.isEmpty()){
            Node n= queue.remove();
            int i=n.x;
            int j=n.y;
            time =n.t;
            if(i>0 &&grid[i-1][j]==1){
                grid[i-1][j]=2;
                Node newNode = new Node(time+1,i-1,j);
                queue.add(newNode);
            }
            
            if(grid.length> (i+1) &&grid[i+1][j]==1){
                grid[i+1][j]=2;
                Node newNode = new Node(time+1,i+1,j);
                queue.add(newNode);
            }
            if(j>0 &&grid[i][j-1]==1){
                grid[i][j-1]=2;
                Node newNode = new Node(time+1,i,j-1);
                queue.add(newNode);
            }
            if(grid[i].length>(j+1)&&grid[i][j+1]==1){
                grid[i][j+1]=2;
                Node newNode = new Node(time+1,i,j+1);
                queue.add(newNode);
            }
        }
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}