package leetcode;

public class Longest_Common_Subsequence_1143 {
    //dynamic programming

    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int len_1=text1.length();
            int len_2=text2.length();
            int[][] dp=new int[len_1+1][len_2+1];
            for(int i=1;i<=len_1;i++){
                for(int j=1;j<=len_2;j++){
                    if(text1.charAt(i)==text2.charAt(j)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[len_1][len_2];
        }
    }
}

