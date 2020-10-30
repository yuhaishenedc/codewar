package leetcode;

public class TwoPointer_83 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null){
                return null;
            }
            int pos=head.val;
            ListNode left=head;
            ListNode right=head;
            while(right!=null){
                while(right!=null&&right.val==pos){
                    right=right.next;
                }
                left.next=right;
                left=left.next;
                if(left!=null){
                    pos=left.val;
                }
            }
            return head;

        }
    }
}
