package leetcode;

public class Array_MianShi_17_14 {
    class Solution {
        public int[] smallestK(int[] arr, int k) {
            buildHeap(arr);
            int len=arr.length;
            len--;
            int[] ret=new int[k];
            for(int i=0;i<k;i++){
                ret[i]=getOne(arr,len);
                len--;
            }
            return ret;
        }

        public void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        public void buildHeap(int[] arr){
            int len=arr.length;
            for(int i=1;i<len;i++){
                int tmp=i;
                while(tmp>0&&arr[tmp]<arr[(tmp-1)/2]){
                    swap(arr,tmp,(tmp-1)/2);
                    tmp=(tmp-1)/2;
                }
            }
        }

        public int getOne(int[] arr,int end){
            int ret=arr[0];
            swap(arr,0,end);
            int begin=0;
            int left=1;
            while(left<end){
                if(left+1<end){
                    if(arr[left]>arr[left+1]){
                        left++;
                    }
                }
                if(arr[begin]<arr[left]){
                    break;
                }
                swap(arr,begin,left);
                begin=left;
                left=left*2+1;
            }
            return ret;
        }


    }
}
