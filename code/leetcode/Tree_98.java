package leetcode;

import java.util.*;

public class Tree_98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            ArrayList<Integer> arr=new ArrayList<>();
            helper(arr,root);
            int sc=arr.size();
            for(int i=0;i<sc-1;i++){
                if(arr.get(i)>=arr.get(i+1)){
                    return false;
                }
            }
            return true;
        }

        public void helper(ArrayList<Integer> arr,TreeNode root){
            if(root!=null){
                helper(arr,root.left);
                arr.add(root.val);
                helper(arr,root.right);
            }

        }
    }
    /*
class Solution {
public:
    int prev;
    bool isValidBST(TreeNode* root) {
        vector<int> v;
        helper(root,v);
        int sc=v.size();
        for(int i=0;i<sc-1;i++){
            if(v[i]>=v[i+1]){
                return false;
            }
        }
        return true;
    }

    void helper(TreeNode* root,vector<int>& v){
        if(root!=NULL){
            helper(root->left,v);
            v.push_back(root->val);
            helper(root->right,v);
        }
    }

};
     */
}
