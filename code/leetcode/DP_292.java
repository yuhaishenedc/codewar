package leetcode;

public class DP_292 {
    //博弈问题
    class Solution {
        public boolean canWinNim(int n) {
            if(n<=3){
                return true;
            }

            int[] dp=new int[3];
            for(int i=0;i<3;i++){
                dp[i]=1;
            }
            for(int i=4;i<=n;i++){
                int tmp=dp[2];
                if(dp[0]==0||dp[1]==0||dp[2]==0){
                    dp[2]=1;
                }
                dp[0]=dp[1];
                dp[1]=tmp;
            }
            if(dp[2]==0){
                return false;
            }

            return true;
        }
    }
}
