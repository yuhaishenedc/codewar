package leetcode;

import java.util.*;

public class BFS_994 {
    class Solution {
        class node{
            int x;
            int y;
            node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }

        public int orangesRotting(int[][] grid) {
            int len1=grid.length;
            if(len1==0){
                return 0;
            }
            int len2=grid[0].length;
            int[][] visited=new int[len1][len2];
            Queue<node> q=new LinkedList<>();
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(grid[i][j]==2){
                        q.offer(new node(i,j));
                        visited[i][j]=1;
                    }
                }
            }
            int step=0;
            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;i++){

                    node cur=q.poll();
                    int x=cur.x;
                    int y=cur.y;
                    if(x-1>=0&&visited[x-1][y]==0&&grid[x-1][y]==1){
                        q.offer(new node(x-1,y));
                        visited[x-1][y]=1;
                    }
                    if(x+1<len1&&visited[x+1][y]==0&&grid[x+1][y]==1){
                        q.offer(new node(x+1,y));
                        visited[x+1][y]=1;
                    }
                    if(y-1>=0&&visited[x][y-1]==0&&grid[x][y-1]==1){
                        q.offer(new node(x,y-1));
                        visited[x][y-1]=1;
                    }
                    if(y+1<len2&&visited[x][y+1]==0&&grid[x][y+1]==1){
                        q.offer(new node(x,y+1));
                        visited[x][y+1]=1;
                    }
                }
                step++;
            }
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(grid[i][j]==1&&visited[i][j]==0){
                        return -1;
                    }
                }
            }
            step-=1;
            return Math.max(0,step);
        }
    }
}
