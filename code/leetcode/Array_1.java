package leetcode;

import java.util.*;

public class Array_1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ret=new int[2];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(target-nums[i],i);
                }
                else{
                    ret[0]=map.get(nums[i]);
                    ret[1]=i;
                    return ret;
                }
            }
            return ret;
        }
    }
}
