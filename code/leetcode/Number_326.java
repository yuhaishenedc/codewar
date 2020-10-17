package leetcode;

public class Number_326 {
    class Solution_1 {
        public boolean isPowerOfThree(int n) {
            double epsilon=0.0000000001;
            return (Math.log(n)/Math.log(3)+epsilon)%1<2*epsilon;
        }
    }

    class Solution_2 {
        public boolean isPowerOfThree(int n) {
            return n>0&&1162261467 % n == 0;
        }
    }

    class Solution_3 {
        public boolean isPowerOfThree(int n) {
            String changeBase=Integer.toString(n,3);
            return changeBase.matches("^10*$");
        }
    }
}
