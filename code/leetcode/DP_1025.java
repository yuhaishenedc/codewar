package leetcode;

public class DP_1025 {
    class Solution {
        public boolean divisorGame(int N) {
            boolean[] dp=new boolean[N+1];
            if(N==1){
                return false;
            }
            else if(N==2){
                return true;
            }
            dp[1]=false;
            dp[2]=true;
            for(int i=3;i<=N;i++){
                for(int j=1;j<i;j++){
                    if(i%j==0&&dp[j]==true){
                        dp[i]=true;
                        break;
                    }
                }
            }
            return dp[N];
        }
    }
}
