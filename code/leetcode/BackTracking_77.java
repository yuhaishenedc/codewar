package leetcode;

import java.util.*;

public class BackTracking_77 {
    class Solution {
        List<List<Integer>> ret;
        public List<List<Integer>> combine(int n, int k) {
            int[] vis=new int[n+1];
            ret=new LinkedList<>();
            helper(vis,n,k,new LinkedList<>(),1);
            return ret;
        }

        public void helper(int[] vis,int n,int k,LinkedList<Integer> arr,int pos){
            if(arr.size()==k){
                ret.add(new LinkedList(arr));
                return;
            }
            for(int i=pos;i<=n;i++){
                if(vis[i]==0){
                    arr.add(i);
                    vis[i]=1;
                    helper(vis,n,k,arr,i+1);
                    arr.removeLast();
                    vis[i]=0;
                }
            }
        }
    }
}
