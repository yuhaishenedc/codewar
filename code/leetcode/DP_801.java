package leetcode;

public class DP_801 {
    class Solution {
        public int minSwap(int[] A, int[] B) {
            int len=A.length;
            int[][] dp=new int[len][2];
            dp[0][0]=0;
            dp[0][1]=1;
            for(int i=1;i<len;i++){
                if(A[i-1]<A[i]&&B[i-1]<B[i]){
                    if(A[i-1]<B[i]&&B[i-1]<A[i]){
                        dp[i][0]=Math.min(dp[i-1][0],dp[i-1][1]);
                        dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+1;
                    }
                    else{
                        dp[i][0]=dp[i-1][0];
                        dp[i][1]=dp[i-1][1]+1;
                    }
                }
                else{
                    dp[i][0]=dp[i-1][1];
                    dp[i][1]=dp[i-1][0]+1;
                }
            }
            return Math.min(dp[len-1][0],dp[len-1][1]);
        }
    }
}
