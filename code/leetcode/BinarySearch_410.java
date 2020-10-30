package leetcode;

public class BinarySearch_410 {
    class Solution {
        public int splitArray(int[] nums, int m) {
            int len=nums.length;
            int sum=0;
            int high=nums[0];
            for(int i=0;i<len;i++){
                if(nums[i]>high){
                    high=nums[i];
                }
                sum+=nums[i];
            }
            int left=high;
            int right=sum+1;
            while(left<right){
                int mid=left+(right-left)/2;
                int n=helper(nums,mid);
                if(n==m){
                    right=mid;
                }
                else if(n<m){
                    right=mid;
                }
                else if(n>m){
                    left=mid+1;
                }
            }
            return left;
        }

        public int helper(int[] nums,int max){
            int cnt=1;
            int len=nums.length;
            int sum=max;
            for(int i=0;i<len;i++){
                if(sum<nums[i]){
                    cnt++;
                    sum=max;
                }
                sum-=nums[i];
            }
            return cnt;
        }
    }
}
