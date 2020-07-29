package leetcode;

public class Longest_Continuous_Increasing_Subsequence_674 {

    //sliding window

    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int len=nums.length;
            int max=1;
            if(len==1){
                return 1;
            }
            else if(len==0){
                return 0;
            }
            int i=0;
            int j=1;
            while(j<len){
                if(nums[j]>nums[j-1]){
                    if(j-i+1>max){
                        max=j-i+1;
                    }
                    j++;
                }
                else{
                    i=j;
                    j++;
                }
            }
            return max;
        }
    }
}


