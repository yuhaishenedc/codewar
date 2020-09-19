package leetcode;

import java.util.*;

public class TwoPointer_151 {
    class Solution {
        public String reverseWords(String s) {
            char[] arr=s.trim().toCharArray();
            int len=arr.length;
            int left=0;
            int right=1;
            if(len==1){
                return s.trim();
            }
            ArrayList<String> list=new ArrayList<>();
            while(right<len){
                while(right<len&&arr[right]!=' '){
                    right++;
                }
                char[] tmp=new char[right-left];
                System.arraycopy(arr,left,tmp,0,right-left);
                list.add(new String(tmp));
                if(right<len){
                    list.add(" ");
                }
                while(right<len&&arr[right]==' '){
                    right++;
                }
                left=right;
            }
            int sc=list.size();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<sc;i++){
                sb.append(list.get(sc-1-i));
            }
            return sb.toString();
        }
    }
}
