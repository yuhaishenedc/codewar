package leetcode;

import java.util.*;

public class DFS_257 {
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            ArrayList<String> arr=new ArrayList<>();
            if(root==null){
                return arr;
            }
            dfs(arr,root,"");
            return arr;
        }

        public void dfs(ArrayList<String> arr,TreeNode root,String s){
            if(root.left==null&&root.right==null){
                arr.add(s+root.val);
                return;
            }
            else if(root.left==null){
                s+=root.val+"->";
                dfs(arr,root.right,s);
            }
            else if(root.right==null){
                s+=root.val+"->";
                dfs(arr,root.left,s);
            }
            else{
                s+=root.val+"->";
                dfs(arr,root.left,s);
                dfs(arr,root.right,s);
            }
        }


    }
}
