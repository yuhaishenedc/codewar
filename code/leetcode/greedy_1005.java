package leetcode;
import java.util.*;

//https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/

public class greedy_1005 {
    //贪心，每次取最小取反，如果取反次数大于数组长度或者取反到了正数
    //此时将最小值取反

    class Solution {
        public int largestSumAfterKNegations(int[] A, int K) {
            Arrays.sort(A);
            int len=A.length;
            int count=0;
            int sum=0;
            for(int i=0;i<K;i++){
                if(count<len&&A[count]<0){
                    A[count]*=-1;
                    count++;
                }
                else{
                    Arrays.sort(A);
                    if((K-count)%2==1){
                        A[0]*=-1;
                    }
                    break;
                }
            }
            for(int i=0;i<len;i++){
                sum+=A[i];
            }
            return sum;
        }
    }
}
