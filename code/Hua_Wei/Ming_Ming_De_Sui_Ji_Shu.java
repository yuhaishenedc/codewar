package Hua_Wei;

import java.util.Arrays;
import java.util.Scanner;

public class Ming_Ming_De_Sui_Ji_Shu {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    arr[i]=0;
                    count++;
                }
            }
            Arrays.sort(arr);
            for(int i=count;i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
