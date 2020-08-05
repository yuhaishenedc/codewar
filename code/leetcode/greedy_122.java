package leetcode;

public class greedy_122 {
    //贪心解法：
    //将每一天的股价都与前一天进行比较，如果股价大于前一天，那么就加上这个差值
    //注意这个算法仅可以进行计算，计算的过程并不是真正的交易过程，但可以用贪心算法计算题目要求的最大利润
    class Greedy_Solution {
        public int maxProfit(int[] prices) {
            int sum=0;
            int len=prices.length;
            for(int i=0;i<len-1;i++){
                if(prices[i]<prices[i+1]){
                    sum+=prices[i+1]-prices[i];
                }
            }
            return sum;
        }
    }



}
