package leetcode;

import java.util.*;

public class BFS_93 {
    class Solution {

        List<String> ret;
        public List<String> restoreIpAddresses(String s) {
            ret=new LinkedList();
            helper(new StringBuilder(),0,s.toCharArray(),s.length(),0);
            return ret;
        }

        public void helper(StringBuilder sb,int cnt,char[] arr,int len,int pos){
            if(pos==len){
                return;
            }
            if(arr[pos]=='0'){
                StringBuilder tmp=new StringBuilder(sb);
                if(cnt==3){
                    if(pos==len-1){
                        tmp.append('0');
                        ret.add(tmp.toString());
                    }
                }
                else{
                    tmp.append("0.");
                    helper(tmp,cnt+1,arr,len,pos+1);
                }
            }
            else{
                int sum=0;
                for(int i=pos;i<len&&i<pos+3;i++){
                    sum*=10;
                    sum+=arr[i]-'0';
                    StringBuilder tmp=new StringBuilder(sb);
                    if(sum<=255){
                        tmp.append(Integer.valueOf(sum));
                        if(cnt==3){
                            if(i==len-1){
                                ret.add(tmp.toString());
                            }
                        }
                        else{
                            tmp.append('.');
                            helper(tmp,cnt+1,arr,len,i+1);
                        }
                    }
                }
            }

        }
    }
}
