package NowCoder;

public class JZ55_TwoPointer {

  class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead){
            ListNode slow=pHead;
            ListNode fast=pHead;
            boolean flag=false;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    flag=true;
                    break;
                }
            }
            if(flag){
                slow=pHead;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            else{
                return null;
            }
        }
    }
}
