package leetcode;

import java.util.*;

public class DFS_897 {
    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            ArrayList<Integer> arr=new ArrayList<>();
            dfs(arr,root);
            if(arr.size()==0){
                return null;
            }
            else{
                TreeNode newRoot=new TreeNode(arr.get(0));
                TreeNode cur=newRoot;
                for(int i=1;i<arr.size();i++){
                    cur.right=new TreeNode(arr.get(i));
                    cur=cur.right;
                }
                return newRoot;
            }
        }

        public void dfs(ArrayList<Integer> arr,TreeNode t){
            if(t!=null){
                dfs(arr,t.left);
                arr.add(t.val);
                dfs(arr,t.right);
            }
        }
    }
}
