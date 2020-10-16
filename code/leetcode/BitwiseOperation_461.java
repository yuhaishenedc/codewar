package leetcode;

public class BitwiseOperation_461 {
    class Solution {
        public int hammingDistance(int x, int y) {
            x=x^y;
            int count=0;
            for(int i=0;i<32;i++){
                if((x&1)==1){
                    count++;
                }
                x>>=1;
            }
            return count;
        }
    }
}
