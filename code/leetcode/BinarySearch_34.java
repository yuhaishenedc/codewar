package leetcode;

public class BinarySearch_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ret=new int[2];
            ret[0]=find_left(nums,target);
            ret[1]=find_right(nums,target);
            return ret;
        }

        public int find_left(int[] nums,int target){
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    right=mid-1;
                }
                else if(nums[mid]>target){
                    right=mid-1;
                }
                else if(nums[mid]<target){
                    left=mid+1;
                }
            }
            if(left>=nums.length||nums[left]!=target){
                return -1;
            }
            return left;

        }

        public int find_right(int[] nums,int target){
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    left=mid+1;
                }
                else if(nums[mid]>target){
                    right=mid-1;
                }
                else if(nums[mid]<target){
                    left=mid+1;
                }
            }
            if(right<0||nums[right]!=target){
                return -1;
            }
            return right;
        }
    }
}
