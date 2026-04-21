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
    HashMap<Integer, List<Integer>> hm = new HashMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        List<List<Integer>> l = new ArrayList<>();
        for(int i : hm.keySet()){
            l.add(hm.get(i));
        }
        return l;
    }

    private void helper(TreeNode root, int level){
        if(root == null){
            return;
        }
        
        if(!hm.containsKey(level)){
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            hm.put(level,l);
        }else{
            List<Integer> t = hm.get(level);
            t.add(root.val);
            hm.put(level,  t);
        }
        helper(root.left, level+1);
        helper(root.right,level+1);
    }
}
