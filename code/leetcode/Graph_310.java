package leetcode;

import java.util.*;

public class Graph_310 {
    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Integer> ret=new ArrayList<>();
            if(n==0){
                return ret;
            }
            else if(n==1){
                ret.add(n-1);
                return ret;
            }
            else if(n==2){
                ret.add(n-1);
                ret.add(n-2);
                return ret;
            }

            int[] in=new int[n];
            HashSet<Integer>[] pre=new HashSet[n];

            for(int i=0;i<n;i++){
                pre[i]=new HashSet<>();
            }

            boolean[] vis=new boolean[n];
            for(int i=0;i<n;i++){
                vis[i]=false;
            }

            for(int[] p:edges){
                in[p[0]]++;
                in[p[1]]++;
                pre[p[1]].add(p[0]);
                pre[p[0]].add(p[1]);
            }

            // System.out.println("indegree");
            // for(int i=0;i<n;i++){
            //     System.out.print(in[i]+" ");
            // }
            // System.out.println("");

            Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<n;i++){
                if(in[i]==1){
                    q.add(i);
                }
            }



            int cnt=0;
            while(n>2){
                int sc=q.size();
                n-=sc;
                for(int i=0;i<sc;i++){
                    int number=q.poll();

                    vis[number]=true;

                    HashSet<Integer> tmp=pre[number];

                    in[number]--;
                    for(int successor:tmp){
                        in[successor]--;
                        if(in[successor]==1){
                            q.add(successor);
                        }
                    }
                }

                // System.out.println("n:"+n);
                // for(int i=0;i<n;i++){
                //     System.out.print(vis[i]+" ");
                // }
                // System.out.println("");

            }

            int len=vis.length;
            for(int i=0;i<len;i++){
                if(vis[i]==false){
                    ret.add(i);
                }
            }

            return ret;



        }
    }
}
