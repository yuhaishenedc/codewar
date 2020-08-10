package leetcode;

public class DP_198 {
    class Solution {
        public int rob(int[] nums) {
            int len=nums.length;
            if(len==0){
                return 0;
            }
            if(len==1){
                return nums[0];
            }
            int[] dp=new int[len+1];
            dp[1]=nums[0];
            dp[2]=Math.max(nums[0],nums[1]);
            for(int i=2;i<=len;i++){
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
            }
            return dp[len];
        }
    }
}
