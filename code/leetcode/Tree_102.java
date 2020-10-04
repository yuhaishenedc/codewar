package leetcode;

public class Tree_102 {
    /*
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ret;
        if(root==NULL){
            return ret;
        }
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int sc=q.size();
            vector<int> v;
            for(int i=0;i<sc;i++){
                TreeNode* tmp=q.front();
                q.pop();
                v.push_back(tmp->val);
                if(tmp->left!=NULL){
                    q.push(tmp->left);
                }
                if(tmp->right!=NULL){
                    q.push(tmp->right);
                }
            }
            ret.push_back(v);
        }
        return ret;
    }
};
     */
}
