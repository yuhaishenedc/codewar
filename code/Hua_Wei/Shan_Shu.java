package Hua_Wei;

//删数

import java.util.*;

public class Shan_Shu {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=i;
            }
            int count=0;
            int temp=0;
            while(count<n){
                for(int i=0;i<n;i++){
                    if(arr[i]>=0){
                        temp++;
                    }
                    if(temp==3){
                        count++;
                        arr[i]=-1;
                        temp=0;
                    }
                    if(count==n){
                        System.out.println(i);
                        break;
                    }
                }

            }
        }
    }
}
