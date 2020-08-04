package leetcode;

//https://leetcode-cn.com/problems/is-subsequence/

public class greedy_392 {
    //贪心思想，每次都在t中找s中的字母，如果找不到就一直往后找，直到找到后
    //接着寻找下一个字母，如果遍历了t中所有字母都没找全，就返回false

    class Solution {
        public boolean isSubsequence(String s, String t) {
            int len_s=s.length();
            int len_t=t.length();
            if(len_s==0){
                return true;
            }
            if(len_t==0){
                return false;
            }
            int i=0;
            int j=0;
            while(j!=len_t){
                if(s.charAt(i)==t.charAt(j)){
                    if(i==len_s-1){
                        return true;
                    }
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            return false;
        }
    }
}
