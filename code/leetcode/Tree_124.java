package leetcode;

public class Tree_124 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        int max;
        public int maxPathSum(TreeNode root) {
            max=Integer.MIN_VALUE;
            helper(root);
            return max;
        }

        public int helper(TreeNode root){
            if(root==null){
                return 0;
            }
            int tmp=Math.max(func(root.left)+func(root.right),func(root.left));
            tmp=Math.max(tmp,func(root.right));
            tmp=Math.max(tmp,0);
            tmp+=root.val;
            max=Math.max(max,tmp);
            helper(root.left);
            helper(root.right);
            return tmp;
        }

        public int func(TreeNode root){
            if(root==null){
                return 0;
            }
            int ret=Math.max(func(root.left),func(root.right));
            ret=Math.max(0,ret);
            ret+=root.val;
            return ret;
        }
    }
}
