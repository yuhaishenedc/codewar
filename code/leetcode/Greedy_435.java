package leetcode;

import java.util.*;

public class Greedy_435 {
    //区间调度问题
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            int len=intervals.length;
            if(len==0){
                return 0;
            }
            Arrays.sort(intervals,new Comparator<int[]>(){
                @Override
                public int compare(int[] a,int[] b){
                    return a[1]-b[1];
                }
            });
            int temp=intervals[0][1];
            int count=1;
            for(int i=1;i<len;i++){
                if(intervals[i][0]>=temp){
                    count++;
                    temp=intervals[i][1];
                }
            }
            return len-count;
        }

    }
}
