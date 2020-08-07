package Hua_Wei;

import java.util.*;

public class Qi_Shui_Ping {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            if(n!=0){
                int full=0;
                int empty=n;
                int sum=0;
                while(full>0||empty>=2){
                    sum+=full;
                    empty+=full;
                    full=empty/3;
                    empty=empty%3;
                    if(full==0&&empty==2){
                        sum+=1;
                        break;
                    }
                }
                System.out.println(sum);
            }
        }

    }
}
