package PinDuoDuo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zhong_Shu {
    //DFS

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr=new int[n+1];
            int sum=0;
            for(int i=1;i<=n;i++){
                arr[i]=input.nextInt();
                sum+=arr[i];
            }
            ArrayList<Integer> ret=new ArrayList<>();
            if(DFS(ret,arr,sum,0)){
                for(int i=0;i<ret.size();i++){
                    System.out.print(ret.get(i));
                    if(i!=ret.size()-1){
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            else{
                System.out.println("-");
            }
        }
    }

    public static boolean DFS(ArrayList<Integer> ret,int[] arr,int sum,int previous){
        if(sum==0){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]*2>sum+1){
                return false;
            }
            if(arr[i]>0&&i!=previous){
                arr[i]--;
                sum--;
                ret.add(i);
                if(DFS(ret,arr,sum,i)){
                    return true;
                }
                arr[i]++;
                sum++;
                ret.remove(ret.size()-1);
            }
        }
        return false;
    }
}
