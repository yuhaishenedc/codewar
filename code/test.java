import java.util.*;
public class test{

    public static void main(String[] args){
        Solution test=new Solution();
        int[][] arr=new int[][]{{0,0,0},{0,1,1}};
        test.floodFill(arr,1,1,1);
    }

}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int l1=image.length;
        if(l1==0){
            return image;
        }
        int l2=image[0].length;
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

