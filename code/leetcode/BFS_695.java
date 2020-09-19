package leetcode;

import java.util.*;

public class BFS_695 {
    class Solution {

        class node{
            int x;
            int y;
            node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }

        public int maxAreaOfIsland(int[][] grid) {
            int ret=0;
            int len1=grid.length;
            int len2=grid[0].length;
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(grid[i][j]==1){
                        int cnt=1;
                        grid[i][j]=0;
                        Queue<node> q=new LinkedList<>();
                        q.offer(new node(i,j));
                        while(!q.isEmpty()){
                            int sc=q.size();
                            for(int k=0;k<sc;k++){
                                node tmp=q.poll();
                                int x=tmp.x;
                                int y=tmp.y;
                                if(x-1>=0&&grid[x-1][y]==1){
                                    q.offer(new node(x-1,y));
                                    grid[x-1][y]=0;
                                    cnt++;
                                }
                                if(x+1<len1&&grid[x+1][y]==1){
                                    q.offer(new node(x+1,y));
                                    grid[x+1][y]=0;
                                    cnt++;
                                }
                                if(y-1>=0&&grid[x][y-1]==1){
                                    q.offer(new node(x,y-1));
                                    grid[x][y-1]=0;
                                    cnt++;
                                }
                                if(y+1<len2&&grid[x][y+1]==1){
                                    q.offer(new node(x,y+1));
                                    grid[x][y+1]=0;
                                    cnt++;
                                }
                            }
                        }
                        ret=Math.max(ret,cnt);
                    }
                }
            }
            return ret;
        }
    }
}
