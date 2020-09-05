package leetcode;

import java.util.*;

public class Graph_207 {
    //BFS的一种变型
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            if(numCourses<=0){
                return false;
            }

            int len=prerequisites.length;
            if(len==0){
                return true;
            }

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
                Integer tmp=queue.poll();
                cnt+=1;
                for(int succeesor:pre[tmp]){
                    in[succeesor]--;
                    if(in[succeesor]==0){
                        queue.add(succeesor);
                    }
                }
            }

            return cnt==numCourses;
        }
    }
}
