package leetcode;

import java.util.*;

public class DP_1027 {
    class Solution {
        public int longestArithSeqLength(int[] A) {
            int len=A.length;
            if(len<2){
                return 0;
            }
            int ret=2;
            Map<Integer,Integer>[] dp=new HashMap[len];
            for(int i=0;i<len;i++){
                dp[i]=new HashMap<>();
                for(int j=0;j<i;j++){
                    int diff=A[i]-A[j];
                    if(dp[j].containsKey(diff)){
                        dp[i].put(diff,dp[j].get(diff)+1);
                    }
                    else{
                        dp[i].put(diff,2);
                    }
                    if(dp[i].get(diff)>ret){
                        ret=dp[i].get(diff);
                    }
                }
            }
            return ret;
        }
    }
}
