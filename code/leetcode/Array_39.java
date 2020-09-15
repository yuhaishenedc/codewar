package leetcode;

import java.util.*;

public class Array_39 {
    class Solution {

        List<List<Integer>> ret;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            ret=new ArrayList<>();
            helper(candidates,target,new ArrayList<>(),0);
            return ret;
        }

        public void helper(int[] candidates,int target,ArrayList<Integer> arr,int pos){
            for(int i=pos;i<candidates.length;i++){
                if(target-candidates[i]>0){
                    ArrayList<Integer> tmp=new ArrayList(arr);
                    tmp.add(candidates[i]);
                    helper(candidates,target-candidates[i],tmp,i);
                }
                else if(target-candidates[i]==0){
                    ArrayList<Integer> tmp=new ArrayList(arr);
                    tmp.add(candidates[i]);
                    ret.add(tmp);
                }
            }
        }
    }
}
