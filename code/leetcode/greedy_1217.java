package leetcode;

//https://leetcode-cn.com/problems/play-with-chips/

public class greedy_1217 {
    //非典型贪心算法
    //因为只有奇数和偶数的区别，所以这里分别统计奇数和偶数然后取最小值就可以

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
