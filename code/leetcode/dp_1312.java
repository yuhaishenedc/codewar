package leetcode;

public class dp_1312 {
    class Solution {
        public int minInsertions(String s) {
            char[] arr=s.toCharArray();
            int n=arr.length;
            int[][] dp=new int[n][n];
            for(int i=0;i<n;i++){
                dp[i][i]=0;
            }
            for(int i=n-2;i>=0;i--){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        dp[i][j]=dp[i+1][j-1];
                    }
                    else{
                        dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;
                    }
                }
            }
            return dp[0][n-1];
        }
    }
}
