package leetcode;

import java.util.*;

public class MonotoneStack_316 {
    class Solution {
        public String removeDuplicateLetters(String t) {
            char[] arr=t.toCharArray();
            int[] count=new int[256];
            int len=arr.length;
            for(int i=0;i<len;i++){
                count[arr[i]]++;
            }
            Stack<Character> s=new Stack();

            boolean[] inStack=new boolean[256];
            for(int i=0;i<len;i++){
                count[arr[i]]--;
                if(inStack[arr[i]]){
                    continue;
                }
                while(!s.isEmpty()&&s.peek()>arr[i]&&count[s.peek()]>0){
                    inStack[s.pop()]=false;
                }
                s.push(arr[i]);
                inStack[arr[i]]=true;

            }
            StringBuilder sb=new StringBuilder();
            while(!s.isEmpty()){
                sb.append(s.pop());
            }
            sb.reverse();
            return sb.toString();
        }
    }
}
