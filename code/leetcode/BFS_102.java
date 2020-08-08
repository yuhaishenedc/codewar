package leetcode;

import java.util.*;

public class BFS_102 {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            LinkedList<TreeNode> queue=new LinkedList<>();
            List<List<Integer>> arr=new ArrayList<>();
            if(root==null){
                return arr;
            }
            queue.offer(root);
            while(!queue.isEmpty()){
                int len=queue.size();
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=0;i<len;i++){
                    TreeNode tmp=queue.poll();
                    a.add(tmp.val);
                    if(tmp.left!=null){
                        queue.offer(tmp.left);
                    }
                    if(tmp.right!=null){
                        queue.offer(tmp.right);
                    }
                }
                arr.add(a);
            }
            return arr;
        }
    }

}
