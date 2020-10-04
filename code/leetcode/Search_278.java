package leetcode;

public class Search_278 {
    /*
class Solution {
public:
    int firstBadVersion(int n) {
        long left=0;
        long right=n;
        long long mid=(left+right)/2;
        while(left<right){
            if(isBadVersion(mid)){
                right=mid;
            }
            else{
                left=mid;
            }
            if(right-left==1){
                if(isBadVersion(left)){
                    return left;
                }
                else{
                    return right;
                }
            }
            mid=(left+right)/2;
        }
        return 1;
    }
};
     */
}
