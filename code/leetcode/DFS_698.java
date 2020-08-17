package leetcode;

public class DFS_698 {
    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int sum=0;
            int len=nums.length;
            for(int i=0;i<len;i++){
                sum+=nums[i];
            }
            if(sum%k!=0){
                return false;
            }
            int target=sum/k;
            boolean[] visited=new boolean[len];
            for(int i=0;i<len;i++){
                visited[i]=false;
            }
            return dfs(nums,visited,k,target,0,0);
        }

        public boolean dfs(int[] nums,boolean[] visited,int k,int target,int sum,int start){
            if(k==0){
                return true;
            }
            if(sum==target){
                return dfs(nums,visited,k-1,target,0,0);
            }
            int len=nums.length;
            for(int i=start;i<len;i++){
                if(!visited[i]&&nums[i]<=target-sum){
                    visited[i]=true;
                    if(dfs(nums,visited,k,target,sum+nums[i],start+1)){
                        return true;
                    }
                    visited[i]=false;
                }
            }
            return false;
        }

    }
}
