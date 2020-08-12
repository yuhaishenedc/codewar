package leetcode;

public class DP_1262 {
    class Solution {
        public int maxSumDivThree(int[] nums) {
            int len=nums.length;
            int[][] dp=new int[len+1][3];
            dp[0][0]=0;
            dp[0][1]=Integer.MIN_VALUE;
            dp[0][2]=Integer.MIN_VALUE;
            for(int i=1;i<=len;i++){
                if(nums[i-1]%3==0){
                    dp[i][0]=Math.max(dp[i-1][0],dp[i-1][0]+nums[i-1]);
                    dp[i][1]=Math.max(dp[i-1][1],dp[i-1][1]+nums[i-1]);
                    dp[i][2]=Math.max(dp[i-1][2],dp[i-1][2]+nums[i-1]);
                }
                else if(nums[i-1]%3==1){
                    dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]+nums[i-1]);
                    dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+nums[i-1]);
                    dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+nums[i-1]);
                }
                else{
                    dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+nums[i-1]);
                    dp[i][1]=Math.max(dp[i-1][1],dp[i-1][2]+nums[i-1]);
                    dp[i][2]=Math.max(dp[i-1][2],dp[i-1][0]+nums[i-1]);
                }
            }
            return dp[len][0];
        }
    }

}
