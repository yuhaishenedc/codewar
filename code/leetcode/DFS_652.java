package leetcode;

import java.util.*;

public class DFS_652 {
    class Solution {
        Map<String,Integer> map;
        List<TreeNode> ret;
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            map=new HashMap();
            ret=new ArrayList();
            helper(root);
            return ret;
        }

        public String helper(TreeNode root){
            if(root==null){
                return "#";
            }
            String ite=root.val+","+helper(root.left)+","+helper(root.right);
            map.put(ite,map.getOrDefault(ite,0)+1);
            if(map.get(ite)==2){
                ret.add(root);
            }
            return ite;
        }
    }
}
