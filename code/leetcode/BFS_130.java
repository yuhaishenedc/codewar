package leetcode;

import java.util.*;

public class BFS_130 {
    class Solution {
        class node{
            int x;
            int y;
            node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }

        public void solve(char[][] board) {
            int len1=board.length;
            if(len1==0){
                return;
            }
            int len2=board[0].length;
            int[][] vistied=new int[len1][len2];
            Queue<node> q=new LinkedList<>();
            for(int i=0;i<len1;i++){
                if(board[i][0]=='O'){
                    q.add(new node(i,0));
                    vistied[i][0]=1;
                }
            }
            for(int i=0;i<len2;i++){
                if(board[0][i]=='O'){
                    q.add(new node(0,i));
                    vistied[0][i]=1;
                }
            }
            for(int i=1;i<len1;i++){
                if(board[i][len2-1]=='O'){
                    q.add(new node(i,len2-1));
                    vistied[i][len2-1]=1;
                }
            }
            for(int i=1;i<len2-1;i++){
                if(board[len1-1][i]=='O'){
                    q.add(new node(len1-1,i));
                    vistied[len1-1][i]=1;
                }
            }

            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;i++){
                    node cur=q.poll();
                    int x=cur.x;
                    int y=cur.y;
                    if(x-1>=0&&vistied[x-1][y]==0&&board[x-1][y]=='O'){
                        q.offer(new node(x-1,y));
                        vistied[x-1][y]=1;
                    }
                    if(y-1>=0&&vistied[x][y-1]==0&&board[x][y-1]=='O'){
                        q.offer(new node(x,y-1));
                        vistied[x][y-1]=1;
                    }
                    if(x+1<len1&&vistied[x+1][y]==0&&board[x+1][y]=='O'){
                        q.offer(new node(x+1,y));
                        vistied[x+1][y]=1;
                    }
                    if(y+1<len2&&vistied[x][y+1]==0&&board[x][y+1]=='O'){
                        q.offer(new node(x,y+1));
                        vistied[x][y+1]=1;
                    }
                }
            }

            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(board[i][j]=='O'&&vistied[i][j]==0){
                        board[i][j]='X';
                    }
                }
            }
        }
    }
}
