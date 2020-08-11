package leetcode;

public class DP_1049 {
    class Solution {
        public int lastStoneWeightII(int[] stones) {
            int sum=0;
            int len=stones.length;
            for(int i=0;i<len;i++){
                sum+=stones[i];
            }
            int bagSize=sum/2;
            int[][] dp=new int[len+1][bagSize+1];
            for(int i=1;i<=len;i++){
                for(int j=1;j<=bagSize;j++){
                    if(stones[i-1]-j>0){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-stones[i-1]]+stones[i-1]);
                    }
                }
            }
            return sum-2*dp[len][bagSize];
        }
    }
}
