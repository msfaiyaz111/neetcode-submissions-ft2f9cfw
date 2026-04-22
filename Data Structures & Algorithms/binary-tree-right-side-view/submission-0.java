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
    HashMap<Integer, Integer> hm = new HashMap<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        List<Integer> l = new ArrayList<>();
        for(int i : hm.keySet()){
            l.add(hm.get(i));
        }
        return l;
    }
    private void helper(TreeNode root, int level){
        if(root == null) return;
        if(!hm.containsKey(level)) hm.put(level, root.val);
        helper(root.right, level+1);
        helper(root.left, level+1);
    }
}
