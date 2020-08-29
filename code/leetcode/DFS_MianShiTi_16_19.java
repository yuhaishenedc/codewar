package leetcode;

import java.util.*;

public class DFS_MianShiTi_16_19 {
    class Solution {
        public int[] pondSizes(int[][] land) {
            int len1=land.length;
            int len2=land[0].length;
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(land[i][j]==0){
                        arr.add(dfs(land,i,j,len1,len2));
                    }
                }
            }
            Collections.sort(arr);
            int[] ret=new int[arr.size()];
            for(int i=0;i<arr.size();i++){
                ret[i]=arr.get(i);
            }
            return ret;
        }

        public int dfs(int[][] land,int x,int y,int len1,int len2){
            if(x<0||y<0||x>=len1||y>=len2||land[x][y]!=0){
                return 0;
            }
            int num=1;
            land[x][y]=-1;
            num+=dfs(land,x-1,y,len1,len2);
            num+=dfs(land,x,y-1,len1,len2);
            num+=dfs(land,x+1,y,len1,len2);
            num+=dfs(land,x,y+1,len1,len2);
            num+=dfs(land,x-1,y-1,len1,len2);
            num+=dfs(land,x-1,y+1,len1,len2);
            num+=dfs(land,x+1,y-1,len1,len2);
            num+=dfs(land,x+1,y+1,len1,len2);

            return num;
        }
    }
}
