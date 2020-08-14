package leetcode;

public class DP_1186 {
    class Solution {
        public int maximumSum(int[] arr) {
            int len=arr.length;
            int[] dp1=new int[len];
            int[] dp2=new int[len];
            dp1[0]=arr[0];
            dp2[0]=arr[0];
            int max=arr[0];
            for(int i=1;i<len;i++){
                dp1[i]=Math.max(dp1[i-1]+arr[i],arr[i]);
                dp2[i]=Math.max(dp2[i-1]+arr[i],dp1[i-1]);
                max=Math.max(max,dp2[i]);
                max=Math.max(max,dp1[i]);
            }
            return max;
        }
    }
}
