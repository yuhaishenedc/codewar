package leetcode;

public class DP_Mian_Shi_Ti_08_01 {
    class Solution {
        public int waysToStep(int n) {
            int mod=1000000007;
            if(n<=2){
                return n;
            }
            if(n==3){
                return 4;
            }
            int[] dp=new int[n+1];
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for(int i=4;i<=n;i++){
                dp[i]=((dp[i-1]+dp[i-2])%mod+dp[i-3])%mod;
            }
            return dp[n];
        }
    }
}
