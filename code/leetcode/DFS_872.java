package leetcode;

import java.util.*;

public class DFS_872 {
    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> arr1=new ArrayList<>();
            ArrayList<Integer> arr2=new ArrayList<>();
            dfs(arr1,root1);
            dfs(arr2,root2);
            if(arr1.size()!=arr2.size()){
                return false;
            }
            for(int i=0;i<arr1.size();i++){
                if(arr1.get(i)!=arr2.get(i)){
                    return false;
                }
            }
            return true;
        }

        public void dfs(ArrayList<Integer> arr,TreeNode root){
            if(root==null){
                return;
            }
            if(root.left==null&&root.right==null){
                arr.add(root.val);
            }
            dfs(arr,root.left);
            dfs(arr,root.right);
        }
    }
}
