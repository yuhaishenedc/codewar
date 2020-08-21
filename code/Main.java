import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String temp=input.nextLine().trim();
            char[] arr=temp.toCharArray();
            int len=arr.length;
            StringBuilder sb=new StringBuilder();
            int begin=len-1;
            int end=len;
            while(begin>0){
                if(arr[begin]!=' '&&begin>0){
                    begin--;
                }
                else{
                    if(begin==0){
                        for(int i=begin;i<end;i++){
                            sb.append(arr[i]);
                        }
                    }
                    else{
                        for(int i=begin+1;i<end;i++){
                            sb.append(arr[i]);
                        }
                        sb.append(' ');
                    }
                    end=begin;
                }
            }
            System.out.println(sb.toString());
        }
    }
}