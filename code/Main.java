import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] arr=new int[]{5,4,3,2,1};
        helper(arr,0,arr.length-1);
        System.out.println("result");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void helper(int[] arr,int l,int r){


        if(l>=r){
            return;
        }
        int left=l;
        int right=r-1;
        while(left<right){
            while(arr[left]<arr[r]&&left<right){
                left++;
            }
            while(arr[right]>arr[r]&&left<right){
                right++;
            }
            swap(arr,left,right);
        }
        if(arr[r]>arr[left]){
            swap(arr,left,r);
        }
        else{
            left++;
        }
        helper(arr,l,left-1);
        helper(arr,left+1,r);
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}