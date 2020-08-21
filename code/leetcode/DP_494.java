package leetcode;

public class DP_494 {
    class Solution {
        public int findTargetSumWays(int[] nums, int S) {
            int len=nums.length;
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=nums[i];
            }
            int[][] dp=new int[len][2*sum+1];
            dp[0][nums[0]+sum]=1;
            dp[0][-nums[0]+sum]+=1;
            for(int i=1;i<len;i++){
                for(int j=-sum;j<=sum;j++){
                    if(j+nums[i]<=sum){
                        dp[i][j+sum]+=dp[i-1][j+nums[i]+sum];
                    }
                    if(j-nums[i]>=-sum){
                        dp[i][j+sum]+=dp[i-1][j-nums[i]+sum];
                    }
                }
            }
            return S>sum?0:dp[len-1][S+sum];
        }
    }
}
