package leetcode;

import java.util.*;

public class BackTracking_113 {
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> ret=new ArrayList<>();
            LinkedList<Integer> a=new LinkedList<>();
            if(root==null){
                return ret;
            }
            helper(ret,a,sum,root);
            return ret;
        }

        public void helper(List<List<Integer>> ret,LinkedList<Integer> track,int sum,TreeNode root){
            if(root.left==null&&root.right==null&&root.val==sum){
                track.add(root.val);
                LinkedList<Integer> add=new LinkedList(track);
                ret.add(add);
                track.removeLast();
                return;
            }
            if(root.left!=null){
                track.add(root.val);
                helper(ret,track,sum-root.val,root.left);
                track.removeLast();
            }
            if(root.right!=null){
                track.add(root.val);
                helper(ret,track,sum-root.val,root.right);
                track.removeLast();
            }
        }
    }
}
