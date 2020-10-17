package leetcode;

public class Factorial_172 {
    class Solution {
        public int trailingZeroes(int n) {
            int ret=0;
            for(;n/5>0;n/=5){
                ret+=n/5;
            }
            return ret;
        }
    }
}
