package leetcode;

public class DP_5 {
    class Solution {
        public String longestPalindrome(String s) {
            int len=s.length();
            int[][] dp=new int[len][len];
            char[] arr=s.toCharArray();
            String ret="";
            int max=Integer.MIN_VALUE;
            for(int i=0;i<len;i++){
                dp[i][i]=1;
            }
            for(int i=len-1;i>=0;i--){
                for(int j=i;j<len;j++){
                    if(arr[i]==arr[j]){
                        if(j==i+1){
                            dp[i][j]=2;
                        }
                        else if(j-i>=2){
                            if(dp[i+1][j-1]>0){
                                dp[i][j]=dp[i+1][j-1]+2;
                            }
                        }
                        if(dp[i][j]>max){
                            max=dp[i][j];
                            ret=s.substring(i,j+1);
                        }
                    }
                }
            }
            return ret;
        }
    }
}
