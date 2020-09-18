package leetcode;

public class Array_795 {
    class Solution {
        public int numSubarrayBoundedMax(int[] A, int L, int R) {
            return helper(A,R)-helper(A,L-1);
        }

        public int helper(int[] A,int bound){
            int sum=0;
            int cur=0;
            for(int i=0;i<A.length;i++){
                if(A[i]<=bound){
                    cur=cur+1;
                    sum+=cur;
                }
                else{
                    cur=0;
                }
            }
            return sum;
        }
    }
}
