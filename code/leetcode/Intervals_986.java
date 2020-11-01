package leetcode;

import java.util.*;

public class Intervals_986 {
    class Solution {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            int i=0;
            int j=0;
            int lenA=A.length;
            int lenB=B.length;
            List<int[]> ret=new ArrayList();
            int pos=0;
            int left=0;
            int right=0;
            while(i<lenA&&j<lenB){
                int a1=A[i][0];
                int a2=A[i][1];
                int b1=B[j][0];
                int b2=B[j][1];

                left=Math.max(a1,b1);
                right=Math.min(a2,b2);

                if(left<=right){
                    ret.add(new int[]{left,right});
                    pos++;
                }

                if(a2<b2){
                    i++;
                }
                else{
                    j++;
                }
            }
            return ret.toArray(new int[pos][]);
        }
    }
}
