package leetcode;

import java.util.*;

public class BFS_OFFER_32_3 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ret=new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            if(root==null){
                return ret;
            }
            q.offer(root);
            int flag=1;
            while(!q.isEmpty()){
                flag*=-1;
                int len=q.size();
                List<Integer> a=new ArrayList<>();
                for(int i=0;i<len;i++){
                    TreeNode cur=q.poll();
                    a.add(cur.val);
                    if(cur.left!=null){
                        q.offer(cur.left);
                    }
                    if(cur.right!=null){
                        q.offer(cur.right);
                    }
                }
                if(flag==1){
                    Collections.reverse(a);
                }
                ret.add(a);
            }
            return ret;
        }
    }
}
