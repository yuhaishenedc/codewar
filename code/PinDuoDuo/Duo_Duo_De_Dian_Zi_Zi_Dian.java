package PinDuoDuo;

import java.math.BigInteger;
import java.util.Scanner;

public class Duo_Duo_De_Dian_Zi_Zi_Dian {
    //分治法

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            long k=input.nextLong();
            BigInteger[][] dp=new BigInteger[51][51];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=m;j++){
                    if(i==0){
                        dp[i][j]=new BigInteger(Integer.toString(j));
                    }
                    else if(j==0){
                        dp[i][j]=new BigInteger(Integer.toString(i));
                    }
                    else{
                        dp[i][j]=dp[i-1][j].add(dp[i][j-1]).add(new BigInteger("2"));
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            while(k>0){
                if(n>0&&m>0){
                    if(dp[n-1][m].compareTo(new BigInteger(Long.toString(k-1)))>=0){
                        k--;
                        sb.append('a');
                        n--;
                    }
                    else{
                        k-=dp[n-1][m].longValue()+2;
                        sb.append('b');
                        m--;
                    }
                }
                else if(n>0&&m==0){
                    n--;
                    k--;
                    sb.append('a');
                }
                else if(n==0&&m>0){
                    m--;
                    k--;
                    sb.append('b');
                }
                else{
                    k=0;
                }
            }
            System.out.println(sb.toString());

        }
    }
}
