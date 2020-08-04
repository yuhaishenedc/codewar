package leetcode;

//https://leetcode-cn.com/problems/play-with-chips/

public class greedy_1217 {
    //非典型贪心算法

    class Solution {
        public int minCostToMoveChips(int[] chips) {
            int len=chips.length;
            if(len==0){
                return 0;
            }
            int even=0;
            int odd=0;
            for(int i=0;i<len;i++){
                if(chips[i]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            return Math.min(odd,even);
        }
    }
}
