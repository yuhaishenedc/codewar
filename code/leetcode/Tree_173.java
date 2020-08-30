package leetcode;

import java.util.*;

public class Tree_173 {
    class BSTIterator {

        List<Integer> list;
        int count;
        int size;

        public BSTIterator(TreeNode root) {
            list=new LinkedList<>();
            inOrder(root);
            count=0;
            size=list.size();
        }

        public void inOrder(TreeNode root){
            if(root!=null){
                inOrder(root.left);
                list.add(root.val);
                inOrder(root.right);
            }
        }

        /** @return the next smallest number */
        public int next() {
            count++;
            return list.get(count-1);
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return count<size;
        }
    }


}
