import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) throws Exception {
        int n=3;
        int cycle=123;
        int base=1;
        if(n==1){
            base=3;
        }
        if(n>1){
            for(int i=0;i<n;i++){
                base*=10;
            }
            base-=1;
        }
        int common=helper(cycle,base);
        cycle/=common;
        base/=common;
        System.out.println(cycle+"/"+base);
    }

    public static int helper(int x1,int x2){
        if(x1<x2){
            int tmp=x1;
            x1=x2;
            x2=tmp;
        }
        while(x2>0){
            int tmp=x1%x2;
            x1=x2;
            x2=tmp;
        }
        return x1;
    }


}




