package leetcode;

import java.util.*;

public class DFS_967 {
    class Solution {
        public int[] numsSameConsecDiff(int N, int K) {
            ArrayList<Integer> arr=new ArrayList<>();
            if(N==1){
                return new int[]{0,1,2,3,4,5,6,7,8,9};
            }
            for(int i=1;i<10;i++){
                dfs(arr,i,N-1,K,i);
            }
            int len=arr.size();
            int[] ret=new int[len];
            for(int i=0;i<len;i++){
                ret[i]=arr.get(i);
            }
            return ret;
        }

        public void dfs(ArrayList<Integer> arr,int before,int n,int k,int sum){
            if(n==0){
                arr.add(sum);
                return;
            }
            for(int i=0;i<10;i++){
                if(i-before==k||before-i==k){
                    sum*=10;
                    sum+=i;
                    dfs(arr,i,n-1,k,sum);
                    sum-=i;
                    sum/=10;
                }
            }
        }
    }
}
