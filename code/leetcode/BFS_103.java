package leetcode;

import java.util.*;

public class BFS_103 {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Queue<TreeNode> q=new LinkedList<>();
            List<List<Integer>> arr=new ArrayList<>();
            if(root==null){
                return arr;
            }
            q.offer(root);
            int flag=1;
            while(!q.isEmpty()){
                flag*=-1;
                int len=q.size();
                ArrayList<Integer> temp=new ArrayList<>();
                for(int i=0;i<len;i++){
                    TreeNode t=q.poll();
                    temp.add(t.val);
                    if(t.left!=null){
                        q.offer(t.left);
                    }
                    if(t.right!=null){
                        q.offer(t.right);
                    }
                }
                if(flag==1){
                    Collections.reverse(temp);
                }
                arr.add(temp);
            }
            // for(int i=0;i<arr.size();i++){
            //     for(int j=0;j<arr.get(i).size();j++){
            //         System.out.print(arr.get(i).get(j)+" ");
            //     }
            //     System.out.println("");
            // }
            return arr;
        }
    }
}
