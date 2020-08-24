package leetcode;

import java.util.*;

public class BackTracking_46 {
    public class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> arr=new ArrayList<>();
            LinkedList<Integer> track=new LinkedList<>();
            backtrack(arr,track,nums);
            return arr;
        }

        public void backtrack(List<List<Integer>> arr,LinkedList<Integer> track,int[] nums){
            if(track.size()==nums.length){
                arr.add(new LinkedList<>(track));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(track.contains(nums[i])){
                    continue;
                }
                track.add(nums[i]);
                backtrack(arr,track,nums);
                track.removeLast();
            }
        }
    }
}
