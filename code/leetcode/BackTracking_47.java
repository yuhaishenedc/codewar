package leetcode;

import java.util.*;

public class BackTracking_47 {
    class Solution {
        List<List<Integer>> tmp;
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            tmp=new ArrayList<>();
            helper(new int[nums.length],new LinkedList<>(),nums);
            int sc=tmp.size();
            return tmp;
        }

        public void helper(int[] vis,LinkedList<Integer> arr,int[] nums){
            if(arr.size()==nums.length){
                tmp.add(new LinkedList(arr));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(vis[i]==0){
                    if(i>0&&nums[i]==nums[i-1]&&vis[i-1]==1){
                        break;
                    }
                    arr.add(nums[i]);
                    vis[i]=1;
                    helper(vis,arr,nums);
                    arr.removeLast();
                    vis[i]=0;
                }
            }
        }
    }
}
