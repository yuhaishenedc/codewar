package leetcode;

public class DP_518 {
    class Solution {
        public int change(int amount, int[] coins) {
            int len=coins.length;
            int[][] dp=new int[len+1][amount+1];
            for(int i=0;i<=len;i++){
                dp[i][0]=1;
            }
            for(int i=1;i<=len;i++){
                for(int j=1;j<=amount;j++){
                    if(j-coins[i-1]>=0){
                        dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            return dp[len][amount];
        }
    }
}
