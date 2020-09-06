package leetcode;

public class Array_84 {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int len=heights.length;
            if(len==0){
                return 0;
            }
            int max=Integer.MIN_VALUE;
            for(int left=0;left<len;left++){
                int count=1;
                int min=heights[left];
                for(int right=left;right<len;right++){
                    min=Math.min(min,heights[right]);
                    max=Math.max(max,min*count);
                    count++;
                }
            }
            return max;
        }
    }
}
