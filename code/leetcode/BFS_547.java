package leetcode;

import java.util.*;

public class BFS_547 {
    class Solution {
        public int findCircleNum(int[][] M) {
            int cnt=0;

            int len=M.length;
            int[] vis=new int[len];

            for(int i=0;i<len;i++){
                if(vis[i]==1){
                    continue;
                }
                cnt++;
                vis[i]=1;
                Queue<Integer> q=new LinkedList<>();
                for(int j=i+1;j<len;j++){
                    if(M[i][j]==1&&vis[j]==0){
                        q.offer(j);
                        vis[j]=1;
                    }
                }
                while(!q.isEmpty()){
                    int sc=q.size();
                    for(int j=0;j<sc;j++){
                        int tmp=q.poll();
                        for(int k=len-1;k>=0;k--){
                            if(M[k][tmp]==1&&vis[k]==0){
                                q.offer(k);
                                vis[k]=1;
                            }
                        }
                    }
                }
            }
            return cnt;
        }
    }
}
