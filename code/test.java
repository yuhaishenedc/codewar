import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) {
        int[] arr=new int[]{-1,4,2,1,9,10};
        Solution test=new Solution();
        test.firstMissingPositive(arr);
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0&&nums[i]<n&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i-1){
                return i;
            }
        }
        return n+1;
    }
}



