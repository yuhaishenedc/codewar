package leetcode;

public class BinarySearch_793 {
    class Solution {
        public int preimageSizeFZF(int K) {
            return (int)right(K)-(int)left(K)+1;
        }

        public long helper(long n){
            long res=0;
            for(;n/5>0;n/=5){
                res+=n/5;
            }
            return res;
        }

        public long left(int K){
            long left=0;
            long right=Long.MAX_VALUE;
            while(left<right){
                long mid=left+(right-left)/2;
                if(helper(mid)<K){
                    left=mid+1;
                }
                else if(helper(mid)>K){
                    right=mid;
                }
                else if(helper(mid)==K){
                    right=mid;
                }
            }
            return left;
        }

        public long right(int K){
            long left=0;
            long right=Long.MAX_VALUE;
            while(left<right){
                long mid=left+(right-left)/2;
                if(helper(mid)<K){
                    left=mid+1;
                }
                else if(helper(mid)>K){
                    right=mid;
                }
                else if(helper(mid)==K){
                    left=mid+1;
                }
            }
            return left-1;
        }
    }
}
