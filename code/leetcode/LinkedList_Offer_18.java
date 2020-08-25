package leetcode;

public class LinkedList_Offer_18 {
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode cur=head;
            ListNode pre=null;
            while(cur.val!=val){
                pre=cur;
                cur=cur.next;
            }
            if(cur==head){
                head=head.next;
            }
            else{
                pre.next=cur.next;
            }
            return head;
        }
    }
}
