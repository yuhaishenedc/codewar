import java.util.*;
public class test{

}


class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        for(int i=m;i<m+n;i++){
            A[i]=B[i-m];
        }
        Shell_sort(A);
    }

    public static void Shell_sort(int[] arr){
        int len=arr.length;
        int shell=len/2;
        while(shell>0){
            for(int i=shell;i<len;i++){
                if(arr[i]<arr[i-shell]){
                    int temp=arr[i];
                    for(int j=i;j>=0;j-=shell){
                        if(j-shell>=0&&temp<arr[j-shell]){
                            arr[j]=arr[j-shell];
                        }
                        else{
                            arr[j]=temp;
                            break;
                        }
                    }
                }
            }
            shell/=2;
        }
    }
}

