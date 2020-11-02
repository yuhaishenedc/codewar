package leetcode;

public class Factorial_793 {
    class Solution {
        public int preimageSizeFZF(int K) {
            long left=getLeft(K);
            long right=getRight(K);
            long r=right-left;
            return (int)r;
        }

        public long getNum(long x){
            long ret=0;
            while(x>0){
                ret+=x/5;
                x/=5;
            }
            return ret;
        }

        public long getLeft(int K){
            long left=0;
            long right=Long.MAX_VALUE;
            while(left<right){
                long mid=left+(right-left)/2;
                if(getNum(mid)<K){
                    left=mid+1;
                }
                else if(getNum(mid)>K){
                    right=mid;
                }
                else{
                    right=mid;
                }
            }
            return left;
        }

        public long getRight(int K){
            long left=0;
            long right=Long.MAX_VALUE;
            while(left<right){
                long mid=left+(right-left)/2;
                if(getNum(mid)<K){
                    left=mid+1;
                }
                else if(getNum(mid)>K){
                    right=mid;
                }
                else{
                    left=mid+1;
                }
            }
            return left;
        }
    }
}
