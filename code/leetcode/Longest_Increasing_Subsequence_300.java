package leetcode;

public class Longest_Increasing_Subsequence_300 {
    //dynamic programming

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int len=nums.length;
            int[] dp=new int[len];
            if(len<=1){
                return len;
            }
            dp[0]=1;
            int ret=1;
            for(int i=0;i<len;i++){
                int max=1;
                for(int j=i;j>=0;j--){
                    if(nums[i]>nums[j]&&dp[j]>=max){
                        max=dp[j]+1;
                        if(max>ret){
                            ret=max;
                        }
                    }
                }
                dp[i]=max;
            }
            return ret;
        }
    }
}
