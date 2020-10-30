package leetcode;

public class TwoPointer_27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int len=nums.length;
            int slow=0;
            int fast=0;
            while(fast!=len){
                if(nums[fast]!=val){
                    nums[slow]=nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
}
