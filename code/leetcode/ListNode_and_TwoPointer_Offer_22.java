package leetcode;

import java.util.*;

public class ListNode_and_TwoPointer_Offer_22 {
    class Stack_Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            Stack<ListNode> s=new Stack<>();
            while(head!=null){
                s.push(head);
                head=head.next;
            }
            ListNode ret=new ListNode();
            for(int i=0;i<k;i++){
                ret=s.pop();
            }
            return ret;
        }
    }

    class Two_Pointer_Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<k;i++){
                fast=fast.next;
            }
            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
    }
}
