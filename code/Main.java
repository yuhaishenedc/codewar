import java.util.*;
public class Main{
    public static void main(String[] args){
        Solution test=new Solution();
        test.permute(new int[]{1,2,3});
    }

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> arr=new ArrayList<>();
            LinkedList<Integer> track=new LinkedList<>();
            backtrack(arr,track,nums);
            return arr;
        }

        public void backtrack(List<List<Integer>> arr,LinkedList<Integer> track,int[] nums){
            for(int i=0;i<track.size();i++){
                System.out.print(track.get(i)+" ");
            }
            System.out.println("");
            if(track.size()==nums.length){
                arr.add(new LinkedList<>(track));
                System.out.println(arr.size());
                System.out.println("here");
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(track.contains(nums[i])){
                    continue;
                }
                track.add(nums[i]);
                backtrack(arr,track,nums);
                track.removeLast();
            }
        }
    }
}