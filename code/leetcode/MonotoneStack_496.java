package leetcode;

import java.util.*;

public class MonotoneStack_496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int len=nums2.length;
            Stack<Integer> s=new Stack();
            Map<Integer,Integer> m=new HashMap();
            for(int i=len-1;i>=0;i--){
                while(!s.isEmpty()&&s.peek()<nums2[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    m.put(nums2[i],-1);
                }
                else{
                    m.put(nums2[i],s.peek());
                }
                s.push(nums2[i]);
            }
            int len_ret=nums1.length;
            int[] ret=new int[len_ret];
            for(int i=0;i<len_ret;i++){
                ret[i]=m.get(nums1[i]);
            }
            return ret;
        }
    }
}
