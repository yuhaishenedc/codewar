package leetcode;

import java.util.*;

public class BFS_127 {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<String> q=new LinkedList<>();
            q.offer(beginWord);
            int len=wordList.size();
            int[] dp=new int[len];
            int count=1;
            while(!q.isEmpty()){
                count++;
                int l=q.size();
                for(int i=0;i<l;i++) {
                    String temp = q.poll();
                    for (int j = 0; j < len; j++) {
                        if (dp[j] == 0 && helper(temp, wordList.get(j))) {
                            dp[j] = 1;
                            if (wordList.get(j).equals(endWord)) {
                                return count;
                            }
                            q.offer(wordList.get(j));
                        }
                    }

                }
            }
            return 0;
        }

        public boolean helper(String s1,String s2){
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            int len1=c1.length;
            int len2=c2.length;
            if(len1!=len2){
                return false;
            }
            for(int i=0;i<len1;i++){
                if(c1[i]!=c2[i]){
                    for(int j=i+1;j<len1;j++){
                        if(c1[j]!=c2[j]){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
