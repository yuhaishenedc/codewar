package leetcode;

public class ListNode_21 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode ret=new ListNode();
            ListNode tmp=ret;
            while(l1!=null&&l2!=null){
                if(l1.val>l2.val){
                    ret.next=l2;
                    l2=l2.next;
                }
                else{
                    ret.next=l1;
                    l1=l1.next;
                }
                ret=ret.next;
            }
            ret.next=l1==null?l2:l1;
            return tmp.next;
        }
    }
}
