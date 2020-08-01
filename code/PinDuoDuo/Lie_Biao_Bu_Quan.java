package PinDuoDuo;

import java.util.Scanner;

public class Lie_Biao_Bu_Quan {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int offset=input.nextInt();
            int n=input.nextInt();
            int l1=input.nextInt();
            int l2=input.nextInt();
            int left1=0;
            int left2=0;
            int right1=0;
            int right2=0;
            if(offset>=l1+l2){
                left1=l1;
                right1=l1;
                left2=l2;
                right2=l2;
            }
            else if(offset>=l1){
                left1=l1;
                right1=l1;
                left2=offset-l1;
                right2=Math.min(l2,offset+n-l1);
            }
            else if(offset+n<=l1){
                left1=offset;
                right1=offset+n;
                left2=0;
                right2=0;
            }
            else{
                left1=offset;
                right1=l1;
                left2=0;
                right2=Math.min(l2,offset+n-l1);
            }
            System.out.println(left1+" "+right1+" "+left2+" "+right2);
        }
    }
}
