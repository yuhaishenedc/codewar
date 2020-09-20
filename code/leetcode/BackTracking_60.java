package leetcode;

import java.util.*;

public class BackTracking_60 {
    class Solution {
        List<Integer> ret;
        int cnt;
        boolean flag;
        public String getPermutation(int n, int k) {
            ret=new LinkedList<>();
            cnt=0;
            flag=true;
            dfs(new LinkedList<>(),new int[n+1],n,k);
            StringBuilder sb=new StringBuilder();
            int sc=ret.size();
            for(int i=0;i<sc;i++){
                sb.append(ret.get(i));
            }
            return sb.toString();
        }

        public void dfs(LinkedList<Integer> arr,int[] vis,int n,int k){
            if(flag){
                if(arr.size()==n){
                    ret=new LinkedList(arr);
                    cnt++;
                    if(cnt==k){
                        flag=false;
                    }
                }
                for(int i=1;i<=n;i++){
                    if(vis[i]==0){
                        arr.add(i);
                        vis[i]=1;
                        dfs(arr,vis,n,k);
                        arr.removeLast();
                        vis[i]=0;
                    }
                }
            }

        }
    }
}
