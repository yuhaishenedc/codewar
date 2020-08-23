package leetcode;

public class DP_322 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp=new int[amount+1];
            if(amount==0){
                return 0;
            }
            dp[0]=0;
            for(int i=1;i<=amount;i++){
                int min=Integer.MAX_VALUE;
                for(int c:coins){
                    if(i-c>=0&&dp[i-c]!=-1){
                        min=Math.min(min,dp[i-c]);
                    }
                }
                if(min==Integer.MAX_VALUE){
                    dp[i]=-1;
                }
                else{
                    dp[i]=min+1;
                }
            }
            return dp[amount];
        }
    }
}
