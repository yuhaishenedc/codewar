package leetcode;

public class Tree_108 {
    /*
class Solution {
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums,0,nums.size()-1);
    }

    TreeNode* helper(vector<int>& nums,int left,int right){
        if(left<right){
            int mid;
            if((left+right)%2==1){
                mid=(left+right)/2+1;
            }
            else{
                mid=(left+right)/2;
            }
            TreeNode* root=new TreeNode(nums[mid]);
            root->left=helper(nums,left,mid-1);
            root->right=helper(nums,mid+1,right);
            return root;
        }
        else if(left==right){
            return new TreeNode(nums[left]);
        }
        return NULL;
    }
};
     */
}
