package leetcode;

public class DP_1025 {
    //博弈问题
    class Solution {
        public boolean divisorGame(int N) {
            if(N<2){
                return false;
            }

            boolean[] dp=new boolean[N+1];
            dp[0]=false;
            dp[1]=false;
            dp[2]=true;
            for(int i=3;i<=N;i++){
                boolean flag=false;
                for(int j=1;j<=Math.sqrt(i);j++){
                    if(i%j==0&&dp[i-j]==false){
                        flag=true;
                        break;
                    }
                }
                dp[i]=flag;
            }
            return dp[N];
        }
    }
}
