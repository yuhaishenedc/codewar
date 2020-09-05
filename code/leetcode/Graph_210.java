package leetcode;

import java.util.*;

public class Graph_210 {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            ArrayList<Integer> arr=new ArrayList<>();

            int len=prerequisites.length;

            int[] in=new int[numCourses];
            HashSet<Integer>[] pre=new HashSet[numCourses];

            for(int i=0;i<numCourses;i++){
                pre[i]=new HashSet<>();
            }

            for(int[] p:prerequisites){
                in[p[0]]++;
                pre[p[1]].add(p[0]);
            }

            Queue<Integer> queue=new LinkedList<>();

            for(int i=0;i<numCourses;i++){
                if(in[i]==0){
                    queue.add(i);
                }
            }

            int cnt=0;
            while(!queue.isEmpty()){
                int tmp=queue.poll();
                arr.add(tmp);
                cnt++;
                for(int successor:pre[tmp]){
                    in[successor]--;
                    if(in[successor]==0){
                        queue.add(successor);
                    }
                }
            }
            if(cnt!=numCourses){
                return new int[0];
            }
            int ret_len=arr.size();
            int[] ret=new int[ret_len];
            for(int i=0;i<ret_len;i++){
                ret[i]=arr.get(i);
            }
            return ret;


        }
    }
}
