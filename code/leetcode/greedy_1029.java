package leetcode;
import java.util.*;

//https://leetcode-cn.com/problems/two-city-scheduling/

public class greedy_1029 {
    //贪心，首先假设两人都去了B市，然后从中选出N个人去A市
    //将cost[i][0]-cost[i][1]就是从B市转去A市需要额外付出的钱
    //将这些cost用一个数组储存并排序，就可以得到最终结果

    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            int len=costs.length;
            int[] cost=new int[len];
            int sum=0;
            for(int i=0;i<len;i++){
                cost[i]=costs[i][0]-costs[i][1];
                sum+=costs[i][1];
            }
            Arrays.sort(cost);
            for(int i=0;i<len/2;i++){
                sum+=cost[i];
            }
            return sum;
        }
    }
}
