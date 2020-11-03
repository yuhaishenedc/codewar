package leetcode;

import java.util.*;

public class TopologicalSort_210 {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] ret=new int[numCourses];
            int[] in=new int[numCourses];
            HashSet<Integer>[] pre=new HashSet[numCourses];

            for(int i=0;i<numCourses;i++){
                pre[i]=new HashSet();
            }

            int len=prerequisites.length;
            for(int i=0;i<len;i++){
                in[prerequisites[i][0]]++;
                pre[prerequisites[i][1]].add(prerequisites[i][0]);
            }

            int cnt=0;
            Queue<Integer> q=new LinkedList();
            for(int i=0;i<numCourses;i++){
                if(in[i]==0){
                    q.offer(i);
                    ret[cnt++]=i;
                }
            }

            while(!q.isEmpty()){
                int tmp=q.poll();
                for(int x:pre[tmp]){
                    in[x]--;
                    if(in[x]==0){
                        q.offer(x);
                        ret[cnt++]=x;
                    }
                }
            }
            if(cnt==numCourses){
                return ret;
            }
            else{
                return new int[0];
            }
        }
    }
}
