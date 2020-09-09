package leetcode;

public class Tree_297 {
    public class pre_Codec {

        String SEP=",";
        String NULL="#";
        int pos;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb=new StringBuilder();
            preOrder(root,sb);
            return sb.toString();
        }

        public void preOrder(TreeNode root,StringBuilder sb){
            if(root==null){
                sb.append(NULL).append(SEP);
                return;
            }
            sb.append(root.val).append(SEP);
            preOrder(root.left,sb);
            preOrder(root.right,sb);

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] arr=data.split(",");
            TreeNode root=new TreeNode(0);
            pos=0;
            return helper(arr,root);
        }

        public TreeNode helper(String[] arr,TreeNode root){
            if(arr[pos].charAt(0)=='#'){
                pos++;
                return null;
            }
            else{
                TreeNode tmp=new TreeNode(Integer.parseInt(arr[pos]));
                pos++;
                tmp.left=helper(arr,tmp);
                tmp.right=helper(arr,tmp);
                return tmp;
            }
        }
    }

    public class post_Codec {

        String SEP=",";
        String NULL="#";
        int pos;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb=new StringBuilder();
            postOrder(root,sb);
            return sb.toString();
        }

        public void postOrder(TreeNode root,StringBuilder sb){
            if(root==null){
                sb.append(NULL).append(SEP);
                return;
            }
            postOrder(root.left,sb);
            postOrder(root.right,sb);
            sb.append(root.val).append(SEP);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] arr=data.split(",");
            pos=arr.length-1;
            return helper(arr);
        }

        public TreeNode helper(String[] arr){
            if(arr[pos].charAt(0)=='#'){
                pos--;
                return null;
            }
            else{
                TreeNode tmp=new TreeNode(Integer.parseInt(arr[pos]));
                pos--;
                tmp.right=helper(arr);
                tmp.left=helper(arr);
                return tmp;
            }
        }
    }
}
