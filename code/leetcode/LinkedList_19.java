package leetcode;

public class LinkedList_19 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ret=new ListNode();
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                return head;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
    }
}
