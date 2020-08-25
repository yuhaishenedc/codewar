package leetcode;

public class Tree_105 {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return helper(preorder,inorder,0,inorder.length-1,0);
        }
        public TreeNode helper(int[] pre,int[] in,int left,int right,int mid){
            if(left>right){
                return null;
            }
            int middle=pre[mid];
            TreeNode root=new TreeNode(middle);
            for(int i=left;i<=right;i++){
                if(in[i]==middle){
                    root.left=helper(pre,in,left,i-1,mid+1);
                    root.right=helper(pre,in,i+1,right,mid+i-left+1);
                }
            }
            return root;
        }
    }
}
