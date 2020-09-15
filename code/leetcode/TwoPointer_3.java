package leetcode;

public class TwoPointer_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] arr=s.toCharArray();
            int len=arr.length;
            if(len<=1){
                return len;
            }
            int[] count=new int[256];
            int left=0,right=0;
            int ret=Integer.MIN_VALUE;
            count[arr[0]]++;
            while(right+1<len){
                while(count[arr[right+1]]>0){
                    count[arr[left]]--;
                    left++;
                }
                right++;
                count[arr[right]]++;
                ret=Math.max(ret,right-left+1);
            }
            return ret;
        }
    }
}
