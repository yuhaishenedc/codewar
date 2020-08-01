package PinDuoDuo;

import java.util.*;

public class Shu_San_Jiao_Xing {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr_x=new int[n];
            int[] arr_y=new int[n];
            for(int i=0;i<n;i++){
                arr_x[i]=input.nextInt();
                arr_y[i]= input.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    for(int k=j;k<n;k++){
                        int a=(arr_x[i]-arr_x[j])*(arr_y[i]-arr_y[k]);
                        int b=(arr_x[i]-arr_x[k])*(arr_y[i]-arr_y[j]);
                        if(a!=b){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
