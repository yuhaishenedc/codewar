package leetcode;

public class TwoPointer_567 {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            int len1=arr1.length;
            int len2=arr2.length;
            if(len1>len2){
                return false;
            }
            else{
                int[] count=new int[256];
                for(int i=0;i<len1;i++){
                    count[arr1[i]]++;
                }
                int left=0;
                int right=len1-1;
                while(right<len2){
                    int[] tmp=new int[256];
                    System.arraycopy(count,0,tmp,0,256);
                    for(int i=left;i<=right;i++){
                        tmp[arr2[i]]--;
                        if(tmp[arr2[i]]<0){
                            break;
                        }
                        if(i==right){
                            return true;
                        }
                    }
                    left++;
                    right++;
                }
            }
            return false;
        }
    }
}
