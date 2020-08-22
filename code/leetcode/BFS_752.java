package leetcode;

import java.util.*;

public class BFS_752 {
    class Solution {
        public int openLock(String[] deadends, String target) {
            Queue<String> q=new LinkedList<>();
            Set<String> visited=new HashSet<>();
            Set<String> dead=new HashSet<>();
            for(String s:deadends){
                dead.add(s);
            }
            q.offer("0000");
            int step=0;
            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;i++){
                    String cur=q.poll();
                    if(cur.equals(target)){
                        return step;
                    }
                    if(dead.contains(cur)){
                        continue;
                    }
                    for(int j=0;j<4;j++){
                        String up=moveUp(cur,j);
                        if(!visited.contains(up)){
                            q.offer(up);
                            visited.add(up);
                        }
                        String down=moveDown(cur,j);
                        if(!visited.contains(down)){
                            q.offer(down);
                            visited.add(down);
                        }
                    }
                }
                step++;
            }
            return -1;
        }

        public String moveUp(String x,int i){
            char[] arr=x.toCharArray();
            if(arr[i]<'9'){
                arr[i]=(char)(arr[i]+1);
            }
            else{
                arr[i]='0';
            }
            return new String(arr);
        }

        public String moveDown(String x,int i){
            char[] arr=x.toCharArray();
            if(arr[i]>'0'){
                arr[i]=(char)(arr[i]-1);
            }
            else{
                arr[i]='9';
            }
            return new String(arr);
        }
    }
}
