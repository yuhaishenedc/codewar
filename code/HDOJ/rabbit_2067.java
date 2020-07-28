package HDOJ;

import java.util.*;
public class rabbit_2067 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=1;
        while(input.hasNext()){
            int n=input.nextInt();
            if(n==-1){
                break;
            }
            else{
                if(n==1){
                    System.out.println(count+" "+n+" "+2);
                    count++;
                }
                else if(n==0){
                    System.out.println(count+" "+n+" "+0);
                    count++;
                }
                else{
                    long[][] dp=new long[n+1][n+1];
                    for(int i=0;i<=n;i++){
                        for(int j=i;j<=n;j++){
                            if(i==0){
                                dp[i][j]=1;
                            }
                            else if(i==j){
                                dp[i][j]=dp[i-1][j];
                            }
                            else{
                                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                            }
                        }
                    }
                    System.out.println(count+" "+n+" "+2*dp[n][n]);
                    count++;
                }

            }
        }
    }
}