package PinDuoDuo;

import java.util.*;

public class Xiao_Xiong_Chi_Tang {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            int[] candy=new int[m];
            for(int i=0;i<m;i++){
                candy[i]=input.nextInt();
            }
            int[] hungry=new int[n];
            int[] battle=new int[n];
            int[] index=new int[n];
            for(int i=0;i<n;i++){
                index[i]=i;
            }
            for(int i=0;i<n;i++){
                battle[i]= input.nextInt();
                hungry[i]=input.nextInt();
            }
            shell(battle,hungry,index);
            Arrays.sort(candy);
            for(int i=n-1;i>=0;i--){
                for(int j=m-1;j>=0;j--){
                    if(hungry[i]>=candy[j]){
                        hungry[i]-=candy[j];
                        candy[j]=0;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(index[j]==i){
                        System.out.println(hungry[j]);
                    }
                }
            }
        }
    }

    public static void shell(int[] battle,int[] hungry,int[] index){
        int len=battle.length;
        int shell=len/2;
        while(shell>0){
            for(int i=shell;i<len;i++){
                if(battle[i]<battle[i-shell]){
                    int tmp=battle[i];
                    int tmp2=hungry[i];
                    int tmp3=index[i];
                    for(int j=i;j>=0;j-=shell){
                        if(j-shell>=0&&tmp<battle[j-shell]){
                            battle[j]=battle[j-shell];
                            hungry[j]=hungry[j-shell];
                            index[j]=index[j-shell];
                        }
                        else{
                            battle[j]=tmp;
                            hungry[j]=tmp2;
                            index[j]=tmp3;
                            break;
                        }
                    }
                }
            }
            shell/=2;
        }
    }


    public static void sort(int[] arr){
        int len=arr.length;
        int shell =len/2;
        while(shell>=1){
            for(int i=shell;i<len;i++){
                if(arr[i]<arr[i-shell]){
                    int tmp=arr[i];
                    for(int j=i;j>=0;j-=shell){
                        if(j-shell>=0&&tmp<arr[j-shell]){
                            arr[j]=arr[j-shell];
                        }
                        else{
                            arr[j]=tmp;
                            break;
                        }
                    }
                }
            }
            shell/=2;
        }
    }
}
