package leetcode;

import java.util.*;

public class Queue_OFFER_59_2 {
    class MaxQueue {

        Stack<Integer> s;
        Queue<Integer> q;

        public MaxQueue() {
            s=new Stack<>();
            q=new LinkedList<>();
        }

        public int max_value() {
            if(s.empty()){
                return -1;
            }
            return s.peek();
        }

        public void push_back(int value) {
            q.offer(value);
            if(s.empty()){
                s.push(value);
            }
            else if(value>s.peek()){
                s.push(value);
            }
            else{
                Stack<Integer> temp=new Stack<>();
                while(!s.empty()&&value<s.peek()){
                    temp.push(s.pop());
                }
                s.push(value);
                while(!temp.empty()){
                    s.push(temp.pop());
                }
            }
        }

        public int pop_front() {
            if(s.empty()){
                return -1;
            }
            int ret=q.poll();
            Stack<Integer> temp=new Stack<>();
            while(!s.empty()&&s.peek()!=ret){
                temp.push(s.pop());
            }
            s.pop();
            while(!temp.empty()){
                s.push(temp.pop());
            }
            return ret;
        }
    }

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
}
