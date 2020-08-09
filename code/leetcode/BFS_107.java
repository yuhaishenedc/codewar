package leetcode;

import java.util.*;

public class BFS_107 {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> arr=new ArrayList<>();
            if(root==null){
                return arr;
            }
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
                int len=q.size();
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=0;i<len;i++){
                    TreeNode tmp=q.poll();
                    a.add(tmp.val);
                    if(tmp.left!=null){
                        q.offer(tmp.left);
                    }
                    if(tmp.right!=null){
                        q.offer(tmp.right);
                    }
                }
                arr.add(a);
            }
            Collections.reverse(arr);
            return arr;
        }
    }
}
