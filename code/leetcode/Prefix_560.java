package leetcode;

import java.util.*;

public class Prefix_560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int ret=0;
            int len=nums.length;
            Map<Integer,Integer> m=new HashMap();
            m.put(0,1);
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=nums[i];
                int sub=sum-k;
                if(m.containsKey(sub)){
                    ret+=m.get(sub);
                }
                m.put(sum,m.getOrDefault(sum,0)+1);
            }
            return ret;
        }
    }
}
