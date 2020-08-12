package leetcode;

import java.util.*;

public class DP_120 {
    class Solution {

        public int minimumTotal(List<List<Integer>> triangle) {
            int len1=triangle.size();
            int len2=triangle.get(len1-1).size();
            int[][] dp=new int[len1][len2];
            return dfs(dp,triangle,0,0);
        }

        public int dfs(int[][] dp,List<List<Integer>> t,int x,int y){
            System.out.println("x:"+x+" y:"+y);
            if(x==t.size()-1){
                dp[x][y]=t.get(x).get(y);
                return t.get(x).get(y);
            }
            if(dp[x+1][y]==0){
                dp[x+1][y]=dfs(dp,t,x+1,y);
            }
            if(dp[x+1][y+1]==0){
                dp[x+1][y+1]=dfs(dp,t,x+1,y+1);
            }
            return t.get(x).get(y)+Math.min(dp[x+1][y],dp[x+1][y+1]);
        }
    }
}
