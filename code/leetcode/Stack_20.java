package leetcode;

import java.util.*;

public class Stack_20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stk=new Stack<>();
            char[] arr=s.toCharArray();
            int len=arr.length;
            for(int i=0;i<len;i++){
                if(arr[i]=='('||arr[i]=='{'||arr[i]=='['){
                    stk.push(arr[i]);
                }
                else if(arr[i]==')'){
                    if(stk.isEmpty()||stk.pop()!='('){
                        return false;
                    }
                }
                else if(arr[i]=='}'){
                    if(stk.isEmpty()||stk.pop()!='{'){
                        return false;
                    }
                }
                else if(arr[i]==']'){
                    if(stk.isEmpty()||stk.pop()!='['){
                        return false;
                    }
                }
            }
            if(stk.isEmpty()){
                return true;
            }
            return false;
        }
    }
}
