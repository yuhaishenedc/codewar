package leetcode;

import java.util.*;

public class Offer_38 {
    class Solution {
        HashSet<String> set;
        public String[] permutation(String s) {
            set=new HashSet<>();
            helper(new StringBuilder(),s.length(),s.toCharArray(),new int[s.length()]);
            int sc=set.size();
            String[] ret=new String[sc];
            int count=0;
            for(String x:set){
                ret[count++]=x;
            }
            return ret;
        }

        public void helper(StringBuilder sb,int len,char[] arr,int[] vis){
            if(sb.length()==len){
                set.add(sb.toString());
            }
            for(int i=0;i<len;i++){
                if(vis[i]==0){
                    sb.append(arr[i]);
                    vis[i]=1;
                    helper(new StringBuilder(sb),len,arr,vis);
                    vis[i]=0;
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
    }
}
