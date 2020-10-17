package leetcode;

import java.util.*;

public class Numbers_204 {
    class Solution {
        public int countPrimes(int n) {
            if(n<=2){
                return 0;
            }
            boolean[] prime=new boolean[n];
            int[] primes=new int[n];
            Arrays.fill(prime,true);
            int count=0;
            for(int i=2;i<n;i++){
                if(prime[i]){
                    primes[count++]=i;
                }
                for(int j=0;j<count&&i*primes[j]<n;j++){
                    prime[i*primes[j]]=false;
                    if(i%primes[j]==0){
                        break;
                    }
                }
            }
            return count;
        }
    }
}
