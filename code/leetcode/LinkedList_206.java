package leetcode;

public class LinkedList_206 {
    class Iteration_Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode pre=null;
            ListNode cur=head;
            while(cur.next!=null){
                ListNode temp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }
            cur.next=pre;
            return cur;
        }
    }
}
