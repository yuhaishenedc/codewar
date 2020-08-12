import java.util.*;
public class test{

    public static void main(String[] args){
        String x="abbd";
        Solution test=new Solution();
        System.out.println(test.longestPalindrome(x));

    }




}

class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int[][] dp=new int[len][len];
        String ret="";
        int max=Integer.MIN_VALUE;
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(i==j){
                        dp[i][j]=1;
                    }
                    else if(j==i+1){
                        dp[i][j]=2;
                    }
                    else{
                        dp[i][j]=dp[i+1][j-1]+2;
                    }
                    if(dp[i][j]>max){
                        max=dp[i][j];
                        ret=s.substring(i,j+1);
                    }
                }
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("");
        }
        return ret;
    }
}
