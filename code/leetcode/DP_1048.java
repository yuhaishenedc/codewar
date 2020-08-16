package leetcode;

import java.util.*;

public class DP_1048 {
    class Solution {
        public int longestStrChain(String[] words) {
            int len=words.length;
            Arrays.sort(words,new Comparator<String>(){
                public int compare(String s1,String s2){
                    return s1.length()-s2.length();
                }
            });
            int max=1;
            Map<String,Integer> m=new HashMap<>();
            for(int i=0;i<len;i++){
                int l=words[i].length();
                for(int j=0;j<l;j++){
                    String temp=words[i].substring(0,j)+words[i].substring(j+1,l);
                    if(m.containsKey(temp)){
                        if(m.get(temp)+1>max){
                            max=m.get(temp)+1;
                        }
                        m.put(words[i],m.get(temp)+1);
                    }
                }
                if(!m.containsKey(words[i])){
                    m.put(words[i],1);
                }
            }
            return max;
        }
    }
}
