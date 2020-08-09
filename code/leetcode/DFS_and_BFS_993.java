package leetcode;

import java.util.*;

public class DFS_and_BFS_993 {
    class BFS_Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            if(root==null){
                return false;
            }
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                int len=q.size();
                int flag=0;
                for(int i=0;i<len;i++){
                    TreeNode tmp=q.poll();
                    if(tmp.left!=null&&tmp.right!=null){

                        if(tmp.left.val==x&&tmp.right.val==y||tmp.left.val==y&&tmp.right.val==x){
                            return false;
                        }
                        else if(tmp.left.val==x||tmp.left.val==y||tmp.right.val==x||tmp.right.val==y){
                            if(flag==1){
                                return true;
                            }
                            else{
                                flag=1;
                            }
                        }
                        q.offer(tmp.left);
                        q.offer(tmp.right);
                    }
                    else if(tmp.left!=null){
                        if(tmp.left.val==x||tmp.left.val==y){
                            if(flag==1){
                                return true;
                            }
                            else{
                                flag=1;
                            }
                        }
                        q.offer(tmp.left);
                    }
                    else if(tmp.right!=null){
                        if(tmp.right.val==x||tmp.right.val==y){
                            if(flag==1){
                                return true;
                            }
                            else{
                                flag=1;
                            }
                        }
                        q.offer(tmp.right);
                    }
                }
            }
            return false;
        }
    }


    class DFS_Solution {
        Map<Integer,Integer> height;
        Map<Integer,TreeNode> parent;


        public boolean isCousins(TreeNode root, int x, int y) {
            height=new HashMap<Integer,Integer>();
            parent=new HashMap<Integer,TreeNode>();
            dfs(height,parent,root,null);
            return height.get(x)==height.get(y)&&parent.get(x)!=parent.get(y);
        }

        public void dfs(Map<Integer,Integer> height,Map<Integer,TreeNode> parent,TreeNode ch,TreeNode pa){
            if(ch!=null){
                if(pa==null){
                    height.put(ch.val,0);
                    parent.put(ch.val,null);
                }
                else{
                    height.put(ch.val,1+height.get(pa.val));
                    parent.put(ch.val,pa);
                }
                dfs(height,parent,ch.left,ch);
                dfs(height,parent,ch.right,ch);
            }
        }
    }

}
