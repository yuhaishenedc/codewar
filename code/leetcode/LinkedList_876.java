package leetcode;

public class LinkedList_876 {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
    }
}
