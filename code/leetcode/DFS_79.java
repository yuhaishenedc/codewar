package leetcode;

public class DFS_79 {
    class Solution {
        public boolean exist(char[][] board, String word) {
            int len1=board.length;
            int len2=board[0].length;
            int[][] visited=new int[len1][len2];
            int len=word.length();
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(board[i][j]==word.charAt(0)){
                        if(dfs(visited,board,0,i,j,word,len,len1,len2)){
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean dfs(int[][] visited,char[][] board,int i,int x,int y,String word,int length,int len1,int len2){

            if(x<0||x>=len1||y<0||y>=len2||visited[x][y]==1||i>=length){
                return false;
            }
            if(i==length-1&&board[x][y]==word.charAt(i)){
                return true;
            }
            if(board[x][y]==word.charAt(i)){
                visited[x][y]=1;
                if(dfs(visited,board,i+1,x-1,y,word,length,len1,len2)||dfs(visited,board,i+1,x+1,y,word,length,len1,len2)||
                        dfs(visited,board,i+1,x,y-1,word,length,len1,len2)||dfs(visited,board,i+1,x,y+1,word,length,len1,len2)){
                    return true;
                }
                visited[x][y]=0;
            }
            return false;
        }
    }
}
