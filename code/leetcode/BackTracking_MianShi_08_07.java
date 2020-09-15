package leetcode;

import java.util.*;

public class BackTracking_MianShi_08_07 {
    class Solution {
        ArrayList<String> a;
        public String[] permutation(String S) {
            a=new ArrayList<>();
            char[] arr=S.toCharArray();
            int len=arr.length;
            int[] vis=new int[len];
            helper(arr,new StringBuilder(),vis);
            int sc=a.size();
            String[] ret=new String[sc];
            for(int i=0;i<sc;i++){
                ret[i]=a.get(i);
            }
            return ret;
        }

        public void helper(char[] arr,StringBuilder sb,int[] vis){
            if(sb.length()==arr.length){
                a.add(sb.toString());
                return;
            }
            for(int i=0;i<arr.length;i++){
                if(vis[i]==0){
                    StringBuilder tmp=new StringBuilder(sb);
                    tmp.append(arr[i]);
                    vis[i]=1;
                    helper(arr,tmp,vis);
                    vis[i]=0;
                }
            }
        }
    }
}
