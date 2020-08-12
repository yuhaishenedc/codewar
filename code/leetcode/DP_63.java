package leetcode;

public class DP_63 {
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int l1=obstacleGrid.length;
            int l2=obstacleGrid[0].length;
            int[][] dp=new int[l1][l2];
            for(int i=0;i<l1&&obstacleGrid[i][0]==0;i++){
                dp[i][0]=1;
            }
            for(int j=0;j<l2&&obstacleGrid[0][j]==0;j++){
                dp[0][j]=1;
            }
            for(int i=1;i<l1;i++){
                for(int j=1;j<l2;j++){
                    if(obstacleGrid[i][j]!=1){
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
            for(int i=0;i<l1;i++){
                for(int j=0;j<l2;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println("");
            }
            return dp[l1-1][l2-1]==-1?0:dp[l1-1][l2-1];
        }
    }
}
