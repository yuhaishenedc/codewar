package leetcode;

import java.util.*;

public class DFS_and_BFS_559 {

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


    class DFS_Solution {
        public int maxDepth(Node root) {
            int max=0;
            if(root==null){
                return 0;
            }
            for(int i=0;i<root.children.size();i++){
                int d=maxDepth(root.children.get(i));
                if(d>max){
                    max=d;
                }
            }
            return 1+max;
        }
    }

    class BFS_Solution {
        public int maxDepth(Node root) {
            if(root==null){
                return 0;
            }
            Queue<Node> q=new LinkedList<Node>();
            q.offer(root);
            int count=0;
            while(!q.isEmpty()){
                int len=q.size();
                count++;
                for(int i=0;i<len;i++){
                    Node tmp=q.poll();
                    for(int j=0;j<tmp.children.size();j++){
                        q.offer(tmp.children.get(j));
                    }
                }
            }
            return count;
        }
    }
}
