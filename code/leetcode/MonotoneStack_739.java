package leetcode;

import java.util.*;

public class MonotoneStack_739 {
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            int len=T.length;
            int[] ret=new int[len];
            Stack<Integer> s=new Stack();
            for(int i=len-1;i>=0;i--){
                while(!s.isEmpty()&&T[s.peek()]<=T[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ret[i]=0;
                }
                else{
                    ret[i]=s.peek()-i;
                }
                s.push(i);
            }
            return ret;
        }
    }
}
