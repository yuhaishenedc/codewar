package leetcode;

public class dp_583 {
    class Solution {
        public int minDistance(String word1, String word2) {
            int len1=word1.length();
            int len2=word2.length();
            int len=helper(word1,word2);
            return len1+len2-2*len;
        }

        public int helper(String s1,String s2){
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            int len1=arr1.length;
            int len2=arr2.length;
            int[][] dp=new int[len1+1][len2+1];
            for(int i=1;i<=len1;i++){
                for(int j=1;j<=len2;j++){
                    if(arr1[i-1]==arr2[j-1]){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[len1][len2];
        }
    }
}
