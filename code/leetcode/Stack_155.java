package leetcode;

import java.util.*;

public class Stack_155 {
    class MinStack {
        Stack<Integer> s;
        Stack<Integer> min_s;
        Stack<Integer> tmp;


        /** initialize your data structure here. */
        public MinStack() {
            s=new Stack<>();
            min_s=new Stack<>();
            tmp=new Stack<>();
        }

        public void push(int x) {
            s.push(x);
            if(s.size()==1||x<min_s.peek()){
                min_s.push(x);
            }
            else{
                min_s.push(min_s.peek());
            }
        }

        public void pop() {
            s.pop();
            min_s.pop();
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return min_s.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
