package leetcode;

public class DP_650 {
    class Solution {
        public int minSteps(int n) {
            int[] dp=new int[n+1];
            if(n==1){
                return 0;
            }
            if(n<=3){
                return n;
            }
            dp[1]=1;
            dp[2]=2;
            dp[3]=3;
            for(int i=4;i<=n;i++){
                for(int j=i/2;j>=1;j--){
                    if(j==1){
                        dp[i]=i;
                        break;
                    }
                    if(i%j==0){
                        dp[i]=dp[j]+(i/j);
                        break;
                    }
                }
            }
            return dp[n];
        }
    }
}
