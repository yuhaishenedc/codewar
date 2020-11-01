package leetcode;

public class Tree_106 {
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
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return helper(inorder.length-1,0,inorder.length,inorder,postorder);
        }

        public TreeNode helper(int pos_start,int in_start,int len,int[] inorder,int[] postorder){
            if(len==0){
                return null;
            }
            else if(len==1){
                return new TreeNode(postorder[pos_start]);
            }

            TreeNode root=new TreeNode(postorder[pos_start]);
            int pos=0;
            for(int i=in_start;i<in_start+len;i++){
                if(inorder[i]==postorder[pos_start]){
                    pos=i;
                    break;
                }
            }

            int len_left=pos-in_start;
            int len_right=in_start+len-1-pos;

            root.left=helper(pos_start-len_right-1,in_start,len_left,inorder,postorder);
            root.right=helper(pos_start-1,in_start+len_left+1,len_right,inorder,postorder);

            return root;

        }
    }
}
