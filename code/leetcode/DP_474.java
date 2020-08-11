package leetcode;

public class DP_474 {
    class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int len=strs.length;
            int[][][] dp=new int[len+1][m+1][n+1];
            for(int i=0;i<=len;i++){
                dp[i][0][0]=0;
            }
            for(int i=1;i<=len;i++){
                int count_0=0;
                int count_1=0;
                int l=strs[i-1].length();
                for(int j=0;j<l;j++){
                    if(strs[i-1].charAt(j)-'1'==0){
                        count_1++;
                    }
                    else{
                        count_0++;
                    }
                }
                for(int j=0;j<=m;j++){
                    for(int k=0;k<=n;k++){
                        if(j-count_0>=0&&k-count_1>=0){
                            dp[i][j][k]=Math.max(1+dp[i-1][j-count_0][k-count_1],dp[i-1][j][k]);
                        }
                        else{
                            dp[i][j][k]=dp[i-1][j][k];
                        }
                    }
                }
            }
            return dp[len][m][n];
        }
    }
}
