// Link - https://leetcode.com/problems/merge-two-binary-trees/
// Time Complexity - O(n) , Space Complexity - O(n)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode n1, TreeNode n2) {
        // Case 1:  Node n1 is null 
        if(n1==null) return n2;

        // Case 2: Node n2 is null 
        if(n2==null) return n1;

        // Case 3: N1 and N2 are not null
        n1.val=n1.val+n2.val;
        n1.left = mergeTrees(n1.left, n2.left);
        n1.right = mergeTrees(n1.left, n2.left);
        return n1;
    }
}