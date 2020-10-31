package leetcode;

import java.util.*;

public class Intervals_56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,new Comparator<int[]>(){
                @Override
                public int compare(int[] a1,int[] a2){
                    return a1[0]-a2[0];
                }
            });
            int len=intervals.length;
            if(len==0){
                return intervals;
            }
            int left=intervals[0][0];
            int right=intervals[0][1];
            int pos=0;
            for(int i=1;i<len;i++){
                if(intervals[i][0]<=right&&intervals[i][1]>right){
                    right=intervals[i][1];
                }
                else if(intervals[i][0]>right){
                    intervals[pos][0]=left;
                    intervals[pos][1]=right;
                    pos++;
                    left=intervals[i][0];
                    right=intervals[i][1];
                }
            }
            intervals[pos][0]=left;
            intervals[pos][1]=right;
            pos++;
            int[][] ret=new int[pos][2];
            System.arraycopy(intervals,0,ret,0,pos);
            return ret;
        }

    }
}
