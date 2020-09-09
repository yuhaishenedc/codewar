package leetcode;

import java.util.*;

public class Monotone_stack_316 {
    class Solution {
        public String removeDuplicateLetters(String s) {
            Stack<Character> stk=new Stack<>();
            int[] count=new int[256];
            char[] arr=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                count[s.charAt(i)]++;
            }
            boolean inStack[]=new boolean[256];
            for(char c:arr){
                count[c]--;
                if(inStack[c]){
                    continue;
                }
                while(!stk.isEmpty()&&stk.peek()>c){
                    if(count[stk.peek()]==0){
                        break;
                    }
                    inStack[stk.pop()]=false;
                }
                stk.push(c);
                inStack[c]=true;
            }
            StringBuilder sb=new StringBuilder();
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
            return sb.reverse().toString();
        }
    }
}
