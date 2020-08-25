package leetcode;

import java.util.*;

public class BFS_200 {
    class Solution {

        class node{
            int x;
            int y;
            node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }

        public int numIslands(char[][] grid) {
            int count=0;
            int len1=grid.length;
            if(len1==0){
                return 0;
            }
            int len2=grid[0].length;
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    Queue<node> q=new LinkedList<>();
                    if(grid[i][j]=='1'){
                        count++;
                        q.offer(new node(i,j));
                        grid[i][j]='0';
                        while(!q.isEmpty()){
                            node cur=q.poll();
                            int x=cur.x;
                            int y=cur.y;
                            if(x-1>=0&&grid[x-1][y]=='1'){
                                q.offer(new node(x-1,y));
                                grid[x-1][y]='0';
                            }
                            if(y-1>=0&&grid[x][y-1]=='1'){
                                q.offer(new node(x,y-1));
                                grid[x][y-1]='0';
                            }
                            if(x+1<len1&&grid[x+1][y]=='1'){
                                q.offer(new node(x+1,y));
                                grid[x+1][y]='0';
                            }
                            if(y+1<len2&&grid[x][y+1]=='1'){
                                q.offer(new node(x,y+1));
                                grid[x][y+1]='0';
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
