package leetcode;

public class DFS_Mian_Shi_Ti_08_10 {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int l1=image.length;
            if(l1==0){
                return image;
            }
            int l2=image[0].length;
            if(image[sr][sc]==newColor){
                return image;
            }
            dfs(image,image[sr][sc],newColor,sr,sc,l1,l2);
            return image;
        }

        public void dfs(int[][] image,int oldColor,int newColor,int x,int y,int l1,int l2){
            image[x][y]=newColor;
            if(x>0&&image[x-1][y]==oldColor){
                dfs(image,oldColor,newColor,x-1,y,l1,l2);
            }
            if(x<l1-1&&image[x+1][y]==oldColor){
                dfs(image,oldColor,newColor,x+1,y,l1,l2);
            }
            if(y>0&&image[x][y-1]==oldColor){
                dfs(image,oldColor,newColor,x,y-1,l1,l2);
            }
            if(y<l2-1&&image[x][y+1]==oldColor){
                dfs(image,oldColor,newColor,x,y+1,l1,l2);
            }
        }
    }
}
