package leetcode;

import java.util.*;

public class Priorityqueue_295 {
    class MedianFinder {

        private PriorityQueue<Integer> large;
        private PriorityQueue<Integer> small;

        /** initialize your data structure here. */
        public MedianFinder() {
            large=new PriorityQueue();
            small=new PriorityQueue(new Comparator<Integer>(){
                @Override
                public int compare(Integer i1,Integer i2){
                    return i2-i1;
                }
            });
        }

        public void addNum(int num) {
            if(small.size()>=large.size()){
                small.offer(num);
                large.offer(small.poll());
            }
            else{
                large.offer(num);
                small.offer(large.poll());
            }
        }

        public double findMedian() {
            if(large.size()>small.size()){
                return large.peek();
            }
            else if(small.size()>large.size()){
                return small.peek();
            }
            else{
                return ((large.peek()+small.peek())*1.0)/2;
            }
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
