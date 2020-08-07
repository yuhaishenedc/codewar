package leetcode;

public class DFS_108 {

    /**
     * Definition for a binary tree node.
     * public */class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return BFS(0,nums.length-1,nums);
        }

        public TreeNode BFS(int left, int right, int[] nums){
            System.out.println("left:"+left+" right:"+right);
            if(left==right){
                return new TreeNode(nums[left]);
            }
            else if(left>right){
                return null;
            }
            int mid=(left+right)/2;

            TreeNode root=new TreeNode(nums[mid]);
            root.left=BFS(left,mid-1,nums);
            root.right=BFS(mid+1,right,nums);
            return root;
        }
    }

}
