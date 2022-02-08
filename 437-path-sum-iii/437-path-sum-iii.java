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
    static int ans;
    public int pathSum(TreeNode root, int targetSum) {
        ans = 0;
        DFS(root,targetSum);        
        return ans;
    }
    
    public void DFS(TreeNode node, int targetSum){
        if(node == null) return;
        checkPath(node,targetSum,0);
        
        System.out.println(ans + "   " + node.val);
        DFS(node.left,targetSum);
        DFS(node.right,targetSum);
        return;
    }
    
    public void checkPath(TreeNode node, int targetSum, int sum){
        if(node == null) return;
        if(sum + node.val == targetSum){
            ans+=1;
        }
        
        checkPath(node.left,targetSum,sum+node.val);
        checkPath(node.right,targetSum,sum+node.val);
        return;
    }
    
}