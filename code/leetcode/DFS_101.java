package leetcode;

public class DFS_101 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
            }
            if(root.left==null&&root.right==null){
                return true;
            }
            if(root.left==null||root.right==null){
                return false;
            }
            return dfs(root.left,root.right);
        }

        public boolean dfs(TreeNode left,TreeNode right){
            if(left==null&&right==null){
                return true;
            }
            else if(left==null||right==null){
                return false;
            }
            if(left.val==right.val){
                return dfs(left.left,right.right)&&dfs(left.right,right.left);
            }
            else{
                return false;
            }
        }
    }
}
