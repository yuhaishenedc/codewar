package leetcode;

import java.util.*;

public class DP_119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ret=new LinkedList<>();
            int[] arr=new int[rowIndex+1];
            for(int i=0;i<=rowIndex;i++){
                int[] tmp=new int[rowIndex+1];
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){
                        tmp[j]=1;
                    }
                    else{
                        tmp[j]=arr[j]+arr[j-1];
                    }
                }
                System.arraycopy(tmp,0,arr,0,rowIndex+1);
            }
            for(int i=0;i<=rowIndex;i++){
                ret.add(arr[i]);
            }
            return ret;
        }
    }
}
