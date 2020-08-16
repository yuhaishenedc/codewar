package leetcode;

import java.util.*;

public class DP_1218 {
    class Solution {
        public int longestSubsequence(int[] arr, int difference) {
            Map<Integer,Integer> m=new HashMap<>();
            int len=arr.length;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<len;i++){
                int temp=m.getOrDefault(arr[i]-difference,0)+1;
                m.put(arr[i],temp);
                if(temp>max){
                    max=temp;
                }
            }
            return max;
        }
    }
}
