package leetcode;

public class Array_560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int len=nums.length;
            int count=0;
            for(int left=0;left<len;left++){
                int sum=0;
                for(int right=left;right<len;right++){
                    sum+=nums[right];
                    if(sum==k){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
