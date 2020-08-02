package NowCoder;

import java.util.*;

//https://www.nowcoder.com/questionTerminal/376282a6682a4005973cde7b3df69584
//快速幂问题

public class Fei_Bo_Na_Qie_Shu_Lie_Wen_Ti_De_Di_Gui_He_Dong_Tai_Gui_Hua {
    public static int c=1000000007;

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            long n=input.nextLong();
            if(n<2){
                System.out.println(n);
                continue;
            }
            long[][] matrix={{1,1},{1,0}};
            long[][] res=power(n-1,matrix);
            System.out.println((1*res[0][1]+res[1][1])%c);
        }
    }

    public static long[][] power(Long n,long[][] matrix){
        long[][] res=new long[matrix.length][matrix.length];
        for(int i=0;i<res.length;i++){
            res[i][i]=1;
        }
        while(n!=0){
            if((n&1)!=0){
                res=multiply(res,matrix);
            }
            matrix=multiply(matrix,matrix);
            n=n>>1;
        }
        return res;
    }

    public static long[][] multiply(long[][] matrix1,long[][] matrix2){
        long[][] res=new long[matrix1.length][matrix1.length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1.length;j++){
                long sum=0;
                for(int k=0;k<matrix1.length;k++){
                    sum=(sum+(matrix1[i][k]*matrix2[k][j])%c)%c;
                }
                res[i][j]=sum;
            }
        }
        return res;
    }
}
