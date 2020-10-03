package leetcode;

public class Array_283 {
    /* 双指针解法
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int left=0;
        int right=0;
        int sc=nums.size();
        while(right<sc){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        while(left<right){
            nums[left]=0;
            left++;
        }
    }
};
     */
}
