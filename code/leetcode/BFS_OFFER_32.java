package leetcode;

import java.util.*;

public class BFS_OFFER_32 {
    class Solution {
        public int[] levelOrder(TreeNode root) {
            if(root==null){
                return new int[0];
            }
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            ArrayList<Integer> arr=new ArrayList<>();
            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;i++){
                    TreeNode cur=q.poll();
                    arr.add(cur.val);
                    if(cur.left!=null){
                        q.offer(cur.left);
                    }
                    if(cur.right!=null){
                        q.offer(cur.right);
                    }
                }
            }
            int[] ret = arr.stream().mapToInt(Integer::intValue).toArray();
            return ret;
        }
    }
}
