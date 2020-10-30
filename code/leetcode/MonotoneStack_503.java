package leetcode;

import java.util.*;

public class MonotoneStack_503 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int len=nums.length;
            int[] arr=new int[2*len];
            int[] arr_ret=new int[2*len];
            System.arraycopy(nums,0,arr,0,len);
            System.arraycopy(nums,0,arr,len,len);
            Stack<Integer> s=new Stack();
            for(int i=2*len-1;i>=0;i--){
                while(!s.isEmpty()&&s.peek()<=arr[i]){
                    s.pop();
                }
                arr_ret[i]=s.isEmpty()?-1:s.peek();
                s.push(arr[i]);
            }
            int[] ret=new int[len];
            System.arraycopy(arr_ret,0,ret,0,len);
            return  ret;
        }
    }
}
