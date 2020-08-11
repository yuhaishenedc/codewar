package leetcode;

public class DP_688 {
    class Solution {
        double[][] dp;

        public double knightProbability(int N, int K, int r, int c) {
            int[] dx=new int[]{1,2,2,1,-1,-2,-2,-1};
            int[] dy=new int[]{2,1,-1,-2,-2,-1,1,2};
            dp=new double[N][N];
            dp[r][c]=1;
            for(int i=0;i<K;i++){
                double[][] dp_new=new double[N][N];
                for(int j=0;j<N;j++){
                    for(int k=0;k<N;k++){
                        for(int l=0;l<8;l++){
                            if(j+dx[l]<N&&j+dx[l]>=0&&k+dy[l]<N&&k+dy[l]>=0){
                                dp_new[j+dx[l]][k+dy[l]]+=dp[j][k]/8.0;
                            }
                        }
                    }
                }
                System.out.println("i:"+i);
                dp=dp_new;
            }
            double ret=0;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    ret+=dp[i][j];
                }
            }
            return ret;
        }
    }
}
