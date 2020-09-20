import java.util.*;
public class Main{


    public static void main(String[] args){
        int[] arr=new int[]{3,2,3,1,2,4,5,5,6};
        thisSolution test=new thisSolution();
        test.findKthLargest(arr,2);
    }
}

class thisSolution {
    public int findKthLargest(int[] nums, int k) {
        buildHeap(nums);
        int len=nums.length;
        int tmp=len;
        for(int i=0;i<k;i++){
            swap(nums,len);
            len--;
        }
        return nums[tmp-k];
    }

    public void buildHeap(int[] nums){
        int len=nums.length;
        if(len<=1){
            return;
        }
        for(int i=1;i<len;i++){
            int father=(i-1)/2;
            int tmp=i;
            while(nums[father]<nums[tmp]){
                int x=nums[father];
                nums[father]=nums[tmp];
                nums[tmp]=x;
                tmp=father;
                father=(tmp-1)/2;
            }
        }
    }

    public void swap(int[] nums,int len){
        int tmp=nums[len-1];
        nums[len-1]=nums[0];
        nums[0]=tmp;
        int cur=0;
        int left=1;
        int right=2;
        while(left<len-1){
            if(right<len-1&&nums[right]>nums[left]){
                left++;
            }
            if(nums[cur]>nums[left]){
                break;
            }
            tmp=nums[left];
            nums[left]=nums[cur];
            nums[cur]=tmp;
            cur=left;
            left=cur*2+1;
            right=left+1;
        }
    }



}