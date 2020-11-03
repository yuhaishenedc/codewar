package leetcode;

import java.util.*;

public class TopologicalSort_207 {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            if(numCourses==0){
                return true;
            }
            int[] in=new int[numCourses];
            HashSet<Integer>[] pre=new HashSet[numCourses];
            for(int i=0;i<numCourses;i++){
                pre[i]=new HashSet();
            }

            int len=prerequisites.length;
            if(len==0){
                return true;
            }
            for(int i=0;i<len;i++){
                pre[prerequisites[i][1]].add(prerequisites[i][0]);
                in[prerequisites[i][0]]++;
            }


            int cnt=0;

            Queue<Integer> q=new LinkedList();
            for(int i=0;i<numCourses;i++){
                if(in[i]==0){
                    q.offer(i);
                    cnt++;
                }
            }

            while(!q.isEmpty()){
                int tmp=q.poll();
                for(int x:pre[tmp]){
                    in[x]--;
                    if(in[x]==0){
                        q.offer(x);
                        cnt++;
                    }
                }
            }


            return cnt==numCourses;
        }
    }
}
