package leetcode;

import java.util.*;

public class Graph_133 {

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    class Solution {
        public Node cloneGraph(Node node) {
            if(node==null){
                return null;
            }
            HashMap<Node,Node> map=new HashMap<>();
            Queue<Node> q=new LinkedList<>();
            q.offer(node);
            map.put(node,new Node(node.val,new ArrayList<>()));

            while(!q.isEmpty()){
                Node tmp=q.poll();
                for(Node n:tmp.neighbors){
                    if(!map.containsKey(n)){
                        map.put(n,new Node(n.val,new ArrayList<>()));
                        q.offer(n);
                    }
                    map.get(tmp).neighbors.add(map.get(n));
                }
            }

            return map.get(node);
        }
    }
}
