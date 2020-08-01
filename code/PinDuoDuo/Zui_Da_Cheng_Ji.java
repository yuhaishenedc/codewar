package PinDuoDuo;

import java.util.*;

public class Zui_Da_Cheng_Ji {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            long min_1=Integer.MAX_VALUE;
            long min_2=Integer.MAX_VALUE;
            long max_1=Integer.MIN_VALUE;
            long max_2=Integer.MIN_VALUE;
            long max_3=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                long tmp=input.nextLong();
                if(tmp<=min_1){
                    min_2=min_1;
                    min_1=tmp;
                }
                else if(tmp<min_2){
                    min_2=tmp;
                }
                if(tmp>=max_1){
                    max_3=max_2;
                    max_2=max_1;
                    max_1=tmp;
                }
                else if(tmp>max_2){
                    max_3=max_2;
                    max_2=tmp;
                }
                else if(tmp>max_3){
                    max_3=tmp;
                }
            }
            long ret=0;
            if(min_2*min_1*max_1>max_1*max_2*max_3){
                System.out.println(min_1*min_2*max_1);
            }
            else{
                System.out.println(max_1*max_2*max_3);
            }
        }
    }

}
