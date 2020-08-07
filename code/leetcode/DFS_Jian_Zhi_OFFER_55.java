package leetcode;

public class DFS_Jian_Zhi_OFFER_55 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            else if(Math.abs(height(root.left)-height(root.right))>1){
                return false;
            }
            return isBalanced(root.left)&&isBalanced(root.right);
        }

        public int height(TreeNode t){
            if(t==null){
                return 0;
            }
            return 1+Math.max(height(t.left),height(t.right));
        }

    }
}
