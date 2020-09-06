package leetcode;

import java.util.*;

public class Array_575 {
    class Solution {

        public int distributeCandies(int[] candies) {
            HashSet<Integer> s=new HashSet<>();
            int len=candies.length;
            for(int i=0;i<len;i++){
                s.add(candies[i]);
            }
            return Math.min(s.size(),len/2);

        }
    }
}
