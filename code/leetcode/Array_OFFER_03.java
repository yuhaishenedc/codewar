package leetcode;

import java.util.*;

public class Array_OFFER_03 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> s=new HashSet<Integer>();
            int len=nums.length;
            for(int i=0;i<len;i++){
                if(s.contains(nums[i])){
                    return nums[i];
                }
                s.add(nums[i]);
            }
            return -1;
        }
    }
}
