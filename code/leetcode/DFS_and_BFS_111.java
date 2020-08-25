package leetcode;

import java.util.*;

public class DFS_and_BFS_111 {
    class DFS_Solution {
        public int minDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            return dfs(root);
        }

        public int dfs(TreeNode root){
            if(root.left==null&&root.right==null){
                return 1;
            }
            else if(root.left==null){
                return 1+minDepth(root.right);
            }
            else if(root.right==null){
                return 1+minDepth(root.left);
            }
            else{
                return 1+Math.min(minDepth(root.left),minDepth(root.right));
            }

        }
    }

    class BFS_Solution {
        public int minDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            LinkedList<TreeNode> q=new LinkedList<TreeNode>();
            q.offer(root);
            int count=0;
            while(!q.isEmpty()){
                int len=q.size();
                count++;
                for(int i=0;i<len;i++){
                    TreeNode tmp=q.poll();
                    if(tmp.left==null&&tmp.right==null){
                        return count;
                    }
                    if(tmp.left!=null){
                        q.offer(tmp.left);
                    }
                    if(tmp.right!=null){
                        q.offer(tmp.right);
                    }
                }
            }
            return count;
        }
    }
}