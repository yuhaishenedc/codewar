package leetcode;

public class TwoPointer_26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int left=0;
            int right=0;
            int pos=0;
            int len=nums.length;
            while(right<len){
                while(right<len&&nums[left]==nums[right]){
                    right++;
                }
                nums[pos++]=nums[left];
                left=right;
            }
            return pos;
        }
    }
}
