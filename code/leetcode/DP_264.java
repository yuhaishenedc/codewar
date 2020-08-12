package leetcode;

public class DP_264 {
    class Solution {
        public int nthUglyNumber(int n) {
            int[] dp=new int[n];
            dp[0]=1;
            int i1=0;
            int i2=0;
            int i3=0;
            for(int i=1;i<n;i++){
                dp[i]=Math.min(Math.min(2*dp[i1],3*dp[i2]),5*dp[i3]);
                if(dp[i]==dp[i1]*2){
                    i1++;
                }
                if(dp[i]==dp[i2]*3){
                    i2++;
                }
                if(dp[i]==dp[i3]*5){
                    i3++;
                }
            }
            return dp[n-1];
        }
    }
}
