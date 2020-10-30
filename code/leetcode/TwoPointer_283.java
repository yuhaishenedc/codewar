package leetcode;

public class TwoPointer_283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int len=nums.length;
            int slow=0;
            int fast=0;
            while(fast<len){
                if(nums[fast]!=0){
                    nums[slow]=nums[fast];
                    slow++;
                }
                fast++;
            }
            for(int i=slow;i<len;i++){
                nums[i]=0;
            }
        }
    }
}
