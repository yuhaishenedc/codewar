package leetcode;

public class Tree_101 {
    /*
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if(root==NULL){
            return true;
        }
        else if(root->left==NULL&&root->right==NULL){
            return true;
        }
        else if(root->left==NULL||root->right==NULL){
            return false;
        }
        else{
            return helper(root->left,root->right);
        }
    }

    bool helper(TreeNode* left,TreeNode* right){
        if(left==NULL&&right==NULL){
            return true;
        }
        else if(left==NULL||right==NULL){
            return false;
        }
        else{
            if(left->val==right->val){
                return helper(left->left,right->right)&&helper(left->right,right->left);
            }
            else{
                return false;
            }
        }
        return true;
    }
};
     */
}
