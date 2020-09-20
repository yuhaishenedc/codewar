package leetcode;

public class DP_Sliding_window_674 {

    //sliding window

    class sliding_window_Solution {
        public int findLengthOfLCIS(int[] nums) {
            int len=nums.length;
            int max=1;
            if(len==1){
                return 1;
            }
            else if(len==0){
                return 0;
            }
            int i=0;
            int j=1;
            while(j<len){
                if(nums[j]>nums[j-1]){
                    if(j-i+1>max){
                        max=j-i+1;
                    }
                    j++;
                }
                else{
                    i=j;
                    j++;
                }
            }
            return max;
        }
    }

    class dp_Solution {
        public int findLengthOfLCIS(int[] nums) {
            int len=nums.length;
            int[] dp=new int[len];
            int ret=1;
            if(len==0){
                return 0;
            }
            dp[0]=1;
            for(int i=1;i<len;i++){
                dp[i]=1;
                if(nums[i]>nums[i-1]){
                    dp[i]=dp[i-1]+1;
                }
                ret=Math.max(dp[i],ret);
            }
            return ret;
        }
    }
}


