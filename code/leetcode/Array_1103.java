package leetcode;

public class Array_1103 {
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] ret=new int[num_people];
            int count=1;
            int i=0;
            while(count<=candies){
                if(i==num_people){
                    i=0;
                }
                ret[i]+=count;
                candies-=count;
                count++;
                if(count>candies&&candies!=0){
                    count=candies;
                }
                i++;
            }
            return ret;
        }
    }
}
