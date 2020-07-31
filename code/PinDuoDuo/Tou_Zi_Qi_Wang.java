package PinDuoDuo;

import java.util.Scanner;

public class Tou_Zi_Qi_Wang {
    //古典概型

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            double ret=0;
            double div=1;
            for(int i=0;i<arr.length;i++){
                div*=(double)arr[i];
            }
            double store=0;
            for(int i=1;i<=max;i++){
                double tmp1=1;
                for(int j=0;j<arr.length;j++){
                    tmp1*=Math.min(i,arr[j]);
                }
                tmp1-=store;
                store+=tmp1;
                ret+=tmp1/div*i;
            }
            System.out.println(String.format("%.2f",ret));
        }
    }
}
