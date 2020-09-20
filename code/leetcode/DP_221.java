package leetcode;

public class DP_221 {
    class Solution {
        public int maximalSquare(char[][] matrix) {
            int len1=matrix.length;
            if(len1==0){
                return 0;
            }
            int len2=matrix[0].length;
            int[][] dp=new int[len1][len2];
            int ret=0;
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    //System.out.println("i:"+i+" j:"+j);
                    if(matrix[i][j]=='1'){
                        dp[i][j]=1;
                        ret=Math.max(dp[i][j],ret);
                        if(i-1>=0&&j-1>=0&&dp[i-1][j-1]>0){
                            int index=dp[i-1][j-1];
                            int cnt_i=1;
                            int cnt_j=1;
                            for(int l1=i-1;l1>=i-index;l1--){
                                if(matrix[l1][j]=='0'){
                                    break;
                                }
                                cnt_i++;
                            }
                            for(int l1=j-1;l1>=j-index;l1--){
                                if(matrix[i][l1]=='0'){
                                    break;
                                }
                                cnt_j++;
                            }
                            dp[i][j]=Math.min(cnt_i,cnt_j);
                            ret=Math.max(ret,dp[i][j]);
                        }
                    }
                }
            }
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println("");
            }
            return ret*ret;
        }
    }
}
