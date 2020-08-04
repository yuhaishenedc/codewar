package leetcode;

//https://leetcode-cn.com/problems/delete-columns-to-make-sorted/

public class greedy_944 {
    //选取每一列的数据进行比较，不是很典型的贪心算法

    class Solution {
        public int minDeletionSize(String[] A) {
            int len=A.length;
            if(len==0){
                return 0;
            }
            int len_N=A[0].length();
            int count=0;
            for(int i=0;i<len_N;i++){
                for(int j=0;j<len-1;j++){
                    if(A[j].charAt(i)>A[j+1].charAt(i)){
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }

}
