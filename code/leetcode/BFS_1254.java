package leetcode;

import java.util.*;

public class BFS_1254 {
    class Solution {
        class node{
            int x;
            int y;
            node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }


        public int closedIsland(int[][] grid) {
            int len1=grid.length;
            int len2=grid[0].length;
            int[][] visited=new int[len1][len2];

            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(i==0||j==0||i==len1-1||j==len2-1){
                        if(grid[i][j]==0&&visited[i][j]==0){
                            bfs(visited,grid,i,j,len1,len2);
                        }
                    }
                }
            }


            int cnt=0;
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(grid[i][j]==0&&visited[i][j]==0){
                        bfs(visited,grid,i,j,len1,len2);
                        cnt++;
                    }
                }
            }

            return cnt;
        }


        public void bfs(int[][] visited,int[][] grid,int x,int y,int len1,int len2){
            Queue<node> q=new LinkedList<>();
            q.offer(new node(x,y));
            visited[x][y]=1;
            while(!q.isEmpty()){
                node tmp=q.poll();
                int i=tmp.x;
                int j=tmp.y;
                if(i-1>0&&visited[i-1][j]==0&&grid[i-1][j]==0){
                    q.offer(new node(i-1,j));
                    visited[i-1][j]=1;
                }
                if(j-1>0&&visited[i][j-1]==0&&grid[i][j-1]==0){
                    q.offer(new node(i,j-1));
                    visited[i][j-1]=1;
                }
                if(i+1<len1&&visited[i+1][j]==0&&grid[i+1][j]==0){
                    q.offer(new node(i+1,j));
                    visited[i+1][j]=1;
                }
                if(j+1<len2&&visited[i][j+1]==0&&grid[i][j+1]==0){
                    q.offer(new node(i,j+1));
                    visited[i][j+1]=1;
                }
            }
        }
    }
}
