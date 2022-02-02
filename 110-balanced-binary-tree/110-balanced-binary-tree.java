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
    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }
    public int checkDepth(TreeNode node){
        if(node == null) return 0;
        
        int leftDepth = checkDepth(node.left);
        if(leftDepth == -1) return -1;
        
        int rightDepth = checkDepth(node.right);
        if(rightDepth == -1) return -1;
        
        int diff = Math.abs(leftDepth - rightDepth);
        
        if(diff > 1){
            return -1;
        }else{
            return Math.max(leftDepth, rightDepth)+1;
        }        
    }
    
}