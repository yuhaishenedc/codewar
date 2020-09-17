package leetcode;

public class Math_223 {
    class Solution {
        public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            long max_height=Math.min(D,H);
            long min_height=Math.max(B,F);
            long max_weight=Math.min(C,G);
            long min_weight=Math.max(A,E);
            long height=0;
            long weight=0;
            if(max_height-min_height>0){
                height=max_height-min_height;
            }
            if(max_weight-min_weight>0){
                weight=max_weight-min_weight;
            }
            long s1=(C-A)*(D-B);
            long s2=(G-E)*(H-F);
            if(weight>0&&height>0){
                return (int)(s1+s2-height*weight);
            }

            else{
                return (int)(s1+s2);
            }
        }
    }
}
