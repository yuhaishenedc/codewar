package leetcode;

public class TwoPointer_88 {
    /*
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int pos=n+m-1;
        int n1=m-1;
        int n2=n-1;
        while(pos>=0){
            if(n1<0){
                nums1[pos]=nums2[n2];
                pos--;
                n2--;
            }
            else if(n2<0){
                nums1[pos]=nums1[n1];
                pos--;
                n1--;
            }
            else{
                if(nums1[n1]>nums2[n2]){
                    nums1[pos]=nums1[n1];
                    pos--;
                    n1--;
                }
                else{
                    nums1[pos]=nums2[n2];
                    pos--;
                    n2--;
                }
            }
        }
    }
};
     */
}
