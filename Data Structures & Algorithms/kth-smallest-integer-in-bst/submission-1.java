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
    List<Integer> l = new ArrayList<>();
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return l.get(k-1);
    }
    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(l.size() == k) return;
        l.add(root.val);
        helper(root.right);
    }
}
