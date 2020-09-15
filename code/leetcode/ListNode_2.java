package leetcode;

public class ListNode_2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int add=0;
            int sum=0;
            ListNode tmp=new ListNode();
            ListNode ret=tmp;
            while(l1!=null&&l2!=null){
                sum=l1.val+l2.val+add;
                add=sum/10;
                sum%=10;
                tmp.next=new ListNode(sum);
                tmp=tmp.next;
                l1=l1.next;
                l2=l2.next;
            }
            while(l1!=null){
                sum=l1.val+add;
                add=sum/10;
                sum%=10;
                l1=l1.next;
                tmp.next=new ListNode(sum);
                tmp=tmp.next;
            }
            while(l2!=null){
                sum=l2.val+add;
                add=sum/10;
                sum%=10;
                l2=l2.next;
                tmp.next=new ListNode(sum);
                tmp=tmp.next;
            }
            if(add==1){
                tmp.next=new ListNode(1);
            }
            return ret.next;
        }
    }
}
