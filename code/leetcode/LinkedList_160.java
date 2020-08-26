package leetcode;

public class LinkedList_160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode l1=headA;
            ListNode l2=headB;
            while(l1!=null&&l2!=null){
                l1=l1.next;
                l2=l2.next;
            }
            l1=l1==null?headB:l1;
            l2=l2==null?headA:l2;
            while(l1!=null&&l2!=null){
                l1=l1.next;
                l2=l2.next;
            }
            l1=l1==null?headB:l1;
            l2=l2==null?headA:l2;
            while(l1!=null&&l2!=null){
                if(l1==l2){
                    return l1;
                }
                l1=l1.next;
                l2=l2.next;
            }
            return null;
        }
    }
}
