package leetcode;

import java.util.*;

public class DP_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret=new LinkedList<>();
            int[] arr=new int[numRows];
            for(int i=0;i<numRows;i++){
                LinkedList<Integer> tmp=new LinkedList<>();
                int[] dp=new int[numRows];
                System.arraycopy(arr,0,dp,0,numRows);
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){
                        tmp.add(1);
                        dp[j]=1;
                    }
                    else{
                        dp[j]=arr[j-1]+arr[j];
                        tmp.add(dp[j]);
                    }
                }
                ret.add(tmp);
                System.arraycopy(dp,0,arr,0,numRows);
            }
            return ret;
        }
    }
}
