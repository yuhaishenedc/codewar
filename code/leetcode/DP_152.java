package leetcode;

public class DP_152 {
    class Solution {
        public int maxProduct(int[] nums) {
            int len=nums.length;
            int[][] dp=new int[len][2];
            dp[0][0]=nums[0];
            dp[0][1]=nums[0];
            for(int i=1;i<len;i++){
                dp[i][0]=Math.max(Math.max(dp[i-1][1]*nums[i],dp[i-1][0]*nums[i]),nums[i]);
                dp[i][1]=Math.min(Math.min(dp[i-1][0]*nums[i],dp[i-1][1]*nums[i]),nums[i]);
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<len;i++){
                if(dp[i][0]>max){
                    max=dp[i][0];
                }
            }
            return max;
        }
    }
}
