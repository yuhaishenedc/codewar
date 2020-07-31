package PinDuoDuo;

import java.util.Scanner;

public class Hui_He_Zhi_You_Xi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int hp=input.nextInt();
            int normal=input.nextInt();
            int buff=input.nextInt();
            if(normal*2>buff){
                if(hp%normal==0){
                    System.out.println(hp/normal);
                }
                else{
                    System.out.println(hp/normal+1);
                }
            }
            else{
                if(hp%buff==0){
                    System.out.println(hp/buff*2);
                }
                else{
                    if(hp%buff<=normal){
                        System.out.println(hp/buff*2+1);
                    }
                    else{
                        System.out.println(hp/buff*2+2);
                    }
                }
            }
        }
    }
}
