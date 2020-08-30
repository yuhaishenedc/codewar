package leetcode;

import java.util.*;

public class Queue_OFFER_9 {
    class CQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public CQueue() {
            s1=new Stack<>();
            s2=new Stack<>();
        }

        public void appendTail(int value) {
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            s2.push(value);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }

        public int deleteHead() {
            if(s1.empty()){
                return -1;
            }
            return s1.pop();
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
