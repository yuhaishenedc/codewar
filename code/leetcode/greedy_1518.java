package leetcode;

//https://leetcode-cn.com/problems/water-bottles/

public class greedy_1518 {
    //贪心思想不明显的一个题

    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int full=numBottles;
            int empty=0;
            int sum=0;
            while(full>0){
                sum+=full;
                empty=full+empty;
                full=empty/numExchange;
                empty=empty%numExchange;
            }
            return sum;
        }
    }
}
