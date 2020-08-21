package leetcode;

public class DP_416 {
    class Solution {
        public boolean canPartition(int[] nums) {
            int len=nums.length;
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=nums[i];
            }
            if(sum%2==1){
                return false;
            }
            sum/=2;
            int[][] dp=new int[len+1][sum+1];
            for(int i=1;i<=len;i++){
                for(int j=1;j<=sum;j++){
                    if(nums[i-1]<=j){
                        dp[i][j]=Math.max(dp[i-1][j-nums[i-1]]+nums[i-1],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            return dp[len][sum]==sum;
        }
    }
}
