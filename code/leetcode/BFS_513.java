package leetcode;

import java.util.*;

public class BFS_513 {
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
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            ArrayList<Integer> arr=new ArrayList<>();
            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;i++){
                    TreeNode cur=q.poll();
                    if(i==0){
                        arr.add(cur.val);
                    }
                    if(cur.left!=null){
                        q.offer(cur.left);
                    }
                    if(cur.right!=null){
                        q.offer(cur.right);
                    }
                }
            }
            return arr.get(arr.size()-1);
        }
    }
}
