package leetcode;

import java.util.*;

public class TwoPointer_15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int len=nums.length;
            List<List<Integer>> ret=new LinkedList<>();
            for(int i=0;i<len-2;i++){
                if(nums[i]>0){
                    return ret;
                }
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }

                int left=i+1;
                int right=len-1;
                while(left<right){
                    int sum=nums[left]+nums[right]+nums[i];
                    if(sum==0){
                        List<Integer> li=new LinkedList<>();
                        li.add(nums[i]);
                        li.add(nums[left]);
                        li.add(nums[right]);
                        ret.add(li);
                        while(left<right&&nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left<right&&nums[right-1]==nums[right]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<0){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            return ret;
        }
    }
}
