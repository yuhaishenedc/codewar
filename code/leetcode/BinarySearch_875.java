package leetcode;

import java.util.*;

public class BinarySearch_875 {
    class Solution {
        public int minEatingSpeed(int[] piles, int H) {
            int max=Arrays.stream(piles).max().getAsInt();
            int left=1;
            int right=max+1;
            while(left<right){
                int mid=left+(right-left)/2;
                if(helper(piles,H,mid)){
                    right=mid;
                }
                else{
                    left=mid+1;
                }
            }
            return left;
        }

        public static boolean helper(int[] piles,int h,int mid){
            int cnt=0;
            int len=piles.length;
            for(int i=0;i<len;i++){
                cnt+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    cnt+=1;
                }
            }
            return cnt<=h;
        }
    }
}
