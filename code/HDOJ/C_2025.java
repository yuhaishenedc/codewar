package HDOJ;

import java.util.Scanner;

public class C_2025 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String temp=input.next();
            char[] arr=temp.toCharArray();
            int len=arr.length;
            int max=Integer.MIN_VALUE;
            char max_c='a';
            for(int i=0;i<len;i++){
                if(arr[i]>max){
                    max=arr[i];
                    max_c=arr[i];
                }
            }
            StringBuilder sb=new StringBuilder(temp);
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)==max_c){
                    sb.insert(i+1,"(max)");
                    i+=5;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
