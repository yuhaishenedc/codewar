package leetcode;

import java.util.*;

public class ListNode_Offer_22 {
    class Solution {
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
}
