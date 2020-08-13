package leetcode;

public class DP_343 {
    class Solution {
        public int cuttingRope(int n) {
            int[] dp=new int[n+1];
            dp[1]=1;
            dp[2]=1;
            for(int i=3;i<=n;i++){
                int max=-1;
                for(int j=1;j<i;j++){
                    if(j*Math.max(i-j,dp[i-j])>max){
                        max=j*Math.max(i-j,dp[i-j]);
                    }
                }
                dp[i]=max;
            }
            return dp[n];
        }
    }
}
