package leetcode;

public class DP_1504 {
    class Solution {
        public int numSubmat(int[][] mat) {
            int l1=mat.length;
            int l2=mat[0].length;
            int[][] dp=new int[l1][l2];
            for(int i=0;i<l1;i++){
                dp[i][0]=mat[i][0];
            }
            for(int i=0;i<l1;i++){
                for(int j=1;j<l2;j++){
                    if(mat[i][j]==1){
                        dp[i][j]=dp[i][j-1]+1;
                    }
                }
            }
            for(int i=0;i<l1;i++){
                for(int j=0;j<l2;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println("");
            }
            int sum=0;
            for(int i=0;i<l1;i++){
                for(int j=0;j<l2;j++){
                    if(dp[i][j]>0){
                        int min=Integer.MAX_VALUE;
                        for(int k=i;k>=0&&dp[k][j]>0;k--){
                            min=Math.min(dp[k][j],min);
                            sum+=min;
                        }
                    }
                }
            }
            return sum;
        }
    }
}
