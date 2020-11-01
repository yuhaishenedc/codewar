package leetcode;

public class Tree_654 {
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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            int pos=0;
            int max=Integer.MIN_VALUE;
            int len=nums.length;
            for(int i=0;i<len;i++){
                if(nums[i]>max){
                    max=nums[i];
                    pos=i;
                }
            }
            TreeNode root=new TreeNode(max);
            int left_len=pos;
            int right_len=len-pos-1;
            if(left_len!=0){
                int[] l=new int[left_len];
                System.arraycopy(nums,0,l,0,left_len);
                root.left=constructMaximumBinaryTree(l);
            }
            if(right_len!=0){
                int[] r=new int[right_len];
                System.arraycopy(nums,pos+1,r,0,right_len);
                root.right=constructMaximumBinaryTree(r);
            }
            return root;
        }

    }
}
