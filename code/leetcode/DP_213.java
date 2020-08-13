package leetcode;

public class DP_213 {
    class Solution {
        public int rob(int[] nums) {
            int len=nums.length;
            if(len==0){
                return 0;
            }
            else if(len==1){
                return nums[0];
            }
            else if(len==2){
                return Math.max(nums[0],nums[1]);
            }
            int[] arr1=new int[len-1];
            int[] arr2=new int[len-1];
            System.arraycopy(nums,0,arr1,0,len-1);
            System.arraycopy(nums,1,arr2,0,len-1);
            return Math.max(helper(arr1),helper(arr2));
        }

        public int helper(int[] a){
            int len=a.length;
            int[] dp=new int[len];
            dp[0]=a[0];
            dp[1]=Math.max(a[0],a[1]);
            for(int i=2;i<len;i++){
                dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
            }
            return dp[len-1];
        }
    }
}
