package leetcode;

public class LinkedList_Offer_52 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode x=headA;
            ListNode y=headB;
            while(x!=y){
                x=x==null?headB:x.next;
                y=y==null?headA:y.next;
            }
            return x;
        }
    }
}
