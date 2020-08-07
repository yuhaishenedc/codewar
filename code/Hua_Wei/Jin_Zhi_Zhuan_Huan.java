package Hua_Wei;

import java.util.*;

public class Jin_Zhi_Zhuan_Huan {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int base=1;
            int sum=0;
            String s=input.nextLine();
            for(int i=s.length()-1;i>=2;i--){
                int temp=0;
                if(s.charAt(i)-'A'>=0&&s.charAt(i)-'A'<=5){
                    temp+=10+s.charAt(i)-'A';
                }
                else{
                    temp+=s.charAt(i)-'0';
                }
                sum+=temp*base;
                base*=16;
            }
            System.out.println(sum);
        }
    }
}
