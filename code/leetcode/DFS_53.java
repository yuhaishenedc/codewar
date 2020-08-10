package leetcode;

public class DFS_53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int len=nums.length;
            int[] dp=new int[len];
            dp[0]=nums[0];
            int max=dp[0];
            for(int i=1;i<len;i++){
                dp[i]=Math.max(0,dp[i-1])+nums[i];
                if(dp[i]>max){
                    max=dp[i];
                }
            }
            return max;
        }
    }
}
