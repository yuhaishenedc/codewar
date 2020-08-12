package leetcode;

import java.util.*;

public class DP_279 {
    class Solution {
        public int numSquares(int n) {
            ArrayList<Integer> arr=new ArrayList<>();
            int[] dp=new int[n+1];
            for(int i=1;i<=n;i++){
                if((int)Math.sqrt(i)*(int)Math.sqrt(i)==i){
                    dp[i]=1;
                    arr.add(i);
                }
                else{
                    int min=Integer.MAX_VALUE;
                    int len=arr.size();
                    for(int j=0;j<len;j++){
                        if(min>dp[i-arr.get(j)]+1){
                            min=dp[i-arr.get(j)]+1;
                        }
                    }
                    dp[i]=min;
                }
            }
            return dp[n];
        }
    }
}
