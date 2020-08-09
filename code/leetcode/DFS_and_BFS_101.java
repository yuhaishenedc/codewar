package leetcode;

import java.util.*;

public class DFS_and_BFS_101 {
    class DFS_Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
            }
            if(root.left==null&&root.right==null){
                return true;
            }
            if(root.left==null||root.right==null){
                return false;
            }
            return dfs(root.left,root.right);
        }

        public boolean dfs(TreeNode left,TreeNode right){
            if(left==null&&right==null){
                return true;
            }
            else if(left==null||right==null){
                return false;
            }
            if(left.val==right.val){
                return dfs(left.left,right.right)&&dfs(left.right,right.left);
            }
            else{
                return false;
            }
        }
    }


    class BFS_Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
            }
            if(root.left==null&&root.right==null){
                return true;
            }
            Queue<TreeNode> left=new LinkedList<>();
            Queue<TreeNode> right=new LinkedList<>();
            left.offer(root);
            right.offer(root);
            while(!left.isEmpty()){
                int len=left.size();
                for(int i=0;i<len;i++){
                    TreeNode l=left.poll();
                    TreeNode r=right.poll();
                    if(l!=null&&r!=null){
                        if(l.val!=r.val){
                            return false;
                        }
                        left.offer(l.left);
                        left.offer(l.right);
                        right.offer(r.right);
                        right.offer(r.left);
                    }
                    else if(l!=null||r!=null){
                        return false;
                    }

                }
            }
            return true;
        }

    }
}
