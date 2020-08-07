package leetcode;

public class DFS_112 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if(root==null){
                return false;
            }
            if(root.left==null&&root.right==null&&root.val==sum){
                return true;
            }
            sum-=root.val;
            return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
        }
    }
}
