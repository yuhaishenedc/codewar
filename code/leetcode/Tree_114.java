package leetcode;

public class Tree_114 {
    class Solution {
        public void flatten(TreeNode root) {
            if(root==null){
                return;
            }
            TreeNode tmp=root.left;
            if(tmp!=null){
                while(tmp.right!=null){
                    tmp=tmp.right;
                }
                tmp.right=root.right;
                root.right=root.left;
                root.left=null;
            }
            flatten(root.right);
        }
    }
}
