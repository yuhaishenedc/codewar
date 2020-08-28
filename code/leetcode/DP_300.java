package leetcode;

public class DP_300 {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int len=nums.length;
            if(len==0){
                return 0;
            }
            int[] dp=new int[len];
            int ret=1;
            dp[0]=1;
            for(int i=1;i<len;i++){
                int max=1;
                for(int j=0;j<i;j++){
                    if(nums[i]>nums[j]){
                        max=Math.max(max,dp[j]+1);
                    }
                }
                dp[i]=max;
                ret=Math.max(max,ret);
            }
            return ret;
        }
    }
}
