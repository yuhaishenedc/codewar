package leetcode;

public class Merge_Sorted_array_88 {

    //using quick sort

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i=m;i<m+n;i++){
                nums1[i]=nums2[i-m];
            }
            quick_sort(nums1);
        }

        public static void quick_sort(int[] arr){
            quick_sort(0,arr.length-1,arr);
        }


        public static void quick_sort(int begin,int end,int[] arr){
            if(begin>=end){
                return;
            }
            int mid=arr[end];
            int left=begin;
            int right=end-1;
            while(left<right){
                while(arr[left]<=mid&&left<right){
                    left++;
                }
                while(arr[right]>=mid&&left<right){
                    right--;
                }
                swap(left,right,arr);
            }
            if(arr[left]>=arr[end]){
                swap(left,end,arr);
            }
            else{
                left++;
            }
            quick_sort(begin,left-1,arr);
            quick_sort(left+1,end,arr);
        }

        public static void swap(int x,int y, int[] arr){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
    }
}
