package leetcode;

//https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/

public class greedy_1221 {
    //非典型贪心

    class Solution {
        public int balancedStringSplit(String s) {
            int left=0,right=0;
            int count=0;
            int len=s.length();
            for(int i=0;i<len;i++){
                if(s.charAt(i)=='L'){
                    left++;
                }
                else{
                    right++;
                }
                if(left==right){
                    count++;
                }
            }
            return count;
        }
    }
}
