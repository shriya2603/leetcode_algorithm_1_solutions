// Link - https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Time Complexity - O(n) , Space Complexity - O(1)
 /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node node = root;
        while(node!=null && node.left!=null){
            Node n1 = node;
            while(true){
                n1.left.next= n1.right;
                if(n1.next==null){
                    break;
                }
                n1.right.next= n1.next.left;
                n1=n1.next;
            }
            node=node.left;
        }    
        return root;   
    }
}