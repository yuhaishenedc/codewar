package leetcode;

public class DP_392 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int len_s=s.length();
            int len_t=t.length();
            if(len_s==0&&len_t==0){
                return true;
            }
            else if(len_s==0){
                return true;
            }
            else if(len_t==0){
                return false;
            }
            int[][] dp=new int[len_t+1][26];
            for(int i=0;i<26;i++){
                dp[len_t][i]=len_t;
            }
            for(int i=len_t-1;i>=0;i--){
                for(int j=0;j<26;j++){
                    if(j==t.charAt(i)-'a'){
                        dp[i][j]=i;
                    }
                    else{
                        dp[i][j]=dp[i+1][j];
                    }
                }
            }
            int pos=0;
            for(int i=0;i<len_s;i++){
                pos=dp[pos][s.charAt(i)-'a']+1;
                if(pos==len_t+1){
                    return false;
                }
            }
            return true;
        }
    }
}
