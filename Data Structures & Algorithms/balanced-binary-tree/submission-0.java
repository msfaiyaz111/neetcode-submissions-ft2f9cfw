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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        goDeep(root);
        return res;
    }

    int goDeep (TreeNode root){
        if(root == null){
            return 0;
        }
        int rightHeight = goDeep(root.left);
        int leftHeight = goDeep(root.right);
        if(Math.abs(rightHeight - leftHeight) <= 1) res &= true;
        else res &= false;
        return 1+Math.max(rightHeight, leftHeight);

    }
}
