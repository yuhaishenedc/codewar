package leetcode;

import java.util.*;

public class ListNode_61 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head==null){
                return null;
            }
            if(k==0){
                return head;
            }
            Queue<ListNode> q=new LinkedList<>();
            ListNode temp=head;
            int count=0;
            while(temp!=null){
                count++;
                q.offer(temp);
                temp=temp.next;
            }
            ListNode tail=head;
            k%=count;
            if(k==0){
                return head;
            }
            for(int i=0;i<count-k;i++){
                tail=q.poll();
            }
            tail.next=null;
            ListNode ret=q.poll();
            ListNode tmp=ret;
            while(!q.isEmpty()){
                tmp=q.poll();
            }
            tmp.next=head;
            return ret;


        }
    }
}
