package leetcode;

public class Minimum_Window_Substring_76 {

    //using sliding window
    static class Solution {
        public String minWindow(String s, String t) {
            int len_t=t.length();
            int i=0;
            int j=len_t-1;
            int len_s=s.length();
            if(len_t>len_s){
                return "";
            }
            int[] count=new int[256];
            for(int k=0;k<len_t;k++){
                count[t.charAt(k)]++;
            }
            for(int k=i;k<=j;k++){
                count[s.charAt(k)]--;
            }
            int min=len_s;
            int index_i=0;
            int index_j=0;
            int flag=-1;
            while(j<len_s){
                if(contain(count)){
                    flag=1;
                    if(min>=j-i+1){
                        min=j-i+1;
                        index_i=i;
                        index_j=j;
                    }
                    count[s.charAt(i)]++;
                    i++;
                }
                else{
                    j++;
                    if(j==len_s){
                        break;
                    }
                    count[s.charAt(j)]--;
                }
            }
            if(flag==1){
                return s.substring(index_i,index_j+1);
            }
            else{
                return "";
            }

        }

        public static boolean contain(int[] arr){
            for(int i=0;i<256;i++){
                if(arr[i]>0){
                    return false;
                }
            }
            return true;
        }
    }
}

