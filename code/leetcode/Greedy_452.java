package leetcode;

import java.util.*;

public class Greedy_452 {
    //区间调度问题
    class Solution {
        public int findMinArrowShots(int[][] points) {
            int len=points.length;
            if(len==0){
                return 0;
            }
            Arrays.sort(points,new Comparator<int[]>(){
                @Override
                public int compare(int[] a,int[] b){
                    return a[1]-b[1];
                }
            });
            int ret=1;
            int temp=points[0][1];
            for(int i=1;i<len;i++){
                if(points[i][0]>temp){
                    ret++;
                    temp=points[i][1];
                }
            }
            return ret;
        }
    }
}
