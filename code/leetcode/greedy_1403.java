package leetcode;

import java.util.*;

//https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/

public class greedy_1403 {
    //非典型贪心

    class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            ArrayList<Integer> arr=new ArrayList<>();
            Arrays.sort(nums);
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            sum/=2;

            for(int i=nums.length-1;i>=0;i--){
                if(sum>=0){
                    arr.add(nums[i]);
                    sum-=nums[i];
                }
                else{
                    break;
                }
            }

            return arr;
        }
    }

}
