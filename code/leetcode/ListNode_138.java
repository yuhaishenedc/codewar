package leetcode;

import java.util.*;

public class ListNode_138 {
    class Solution {
        public Node copyRandomList(Node head) {
            if(head==null){
                return null;
            }
            Node tmp1=head;
            Node tmp2=head;
            Node ret=head;
            Node rec=head;
            while(head!=null){
                int v=head.val;
                Node tmp=new Node(v);
                tmp.next=head.next;
                head.next=tmp;
                head=head.next.next;
            }

            while(tmp1!=null){
                if(tmp1.random!=null){
                    tmp1.next.random=tmp1.random.next;
                }
                else{
                    tmp1.next.random=null;
                }
                tmp1=tmp1.next.next;
            }
            tmp2=tmp2.next;
            ret=tmp2;
            while(tmp2.next!=null){
                rec.next=rec.next.next;
                rec=rec.next;
                tmp2.next=tmp2.next.next;
                tmp2=tmp2.next;
            }
            rec.next=null;
            return ret;
        }
    }
}
