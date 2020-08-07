package leetcode;

public class DFS_100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null){
                return true;
            }
            else if(p==null||q==null){
                return false;
            }
            else if(p.left==null){
                if(q.left==null){
                    if(p.val==q.val){
                        return isSameTree(p.right,q.right);
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(p.right==null){
                if(q.right==null){
                    if(p.val==q.val){
                        return isSameTree(p.left,q.left);
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                if(p.val==q.val){
                    return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
                }
                else{
                    return false;
                }

            }
        }
    }
}
