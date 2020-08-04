package leetcode;
import java.util.*;

//https://leetcode-cn.com/problems/assign-cookies/

public class greedy_455 {
    //每次都选择胃口最小的，然后看能否满足

    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int len_g=g.length;
            int len_s=s.length;
            int count=0;
            int index=0;
            for(int i=0;i<len_g;i++){
                for(int j=index;j<len_s;j++){
                    if(s[j]>=g[i]){
                        index=j+1;
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }
}
