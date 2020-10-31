package leetcode;

import java.util.*;

public class Intervals_1288 {
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals,new Comparator<int[]>(){
                @Override
                public int compare(int[] arr1,int[] arr2){
                    if(arr1[0]==arr2[0]){
                        return arr2[1]-arr1[1];
                    }
                    return arr1[0]-arr2[0];
                }
            });
            int len=intervals.length;
            int left=intervals[0][0];
            int right=intervals[0][1];
            int cnt=0;
            for(int i=1;i<len;i++){
                if(intervals[i][1]<=right){
                    cnt++;
                }
                else if(intervals[i][0]<right&&intervals[i][1]>right){
                    right=intervals[i][1];
                }
                else if(intervals[i][0]>=right){
                    left=intervals[i][0];
                    right=intervals[i][1];
                }
            }
            return len-cnt;
        }
    }
}
