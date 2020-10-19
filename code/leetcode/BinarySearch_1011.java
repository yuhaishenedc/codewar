package leetcode;

import java.util.*;

public class BinarySearch_1011 {
    class Solution {
        public int shipWithinDays(int[] weights, int D) {
            int left=Arrays.stream(weights).max().getAsInt();
            int right=Arrays.stream(weights).sum()+1;
            while(left<right){
                int mid=left+(right-left)/2;
                if(helper(weights,D,mid)){
                    right=mid;
                }
                else{
                    left=mid+1;
                }
            }
            return left;
        }

        public boolean helper(int[] weights,int D,int mid){
            int cnt=1;
            int pos=0;
            int tmp=mid;
            while(pos<weights.length){
                if(weights[pos]<=tmp){
                    tmp-=weights[pos];
                    pos++;
                }
                else{
                    tmp=mid;
                    cnt++;
                }
            }
            return cnt<=D;
        }
    }
}
