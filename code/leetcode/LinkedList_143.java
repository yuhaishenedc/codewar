package leetcode;

import java.util.*;

public class LinkedList_143 {
    class Solution {
        public void reorderList(ListNode head) {
            Stack<ListNode> s=new Stack<>();
            ListNode tmp=head;
            int count=0;
            while(tmp!=null){
                s.push(tmp);
                tmp=tmp.next;
                count++;
            }
            ListNode ret=head;
            for(int i=0;i<count/2;i++){
                //System.out.println("i:"+i);
                ListNode insert=s.pop();
                //System.out.println("insert:"+insert.val);
                insert.next=ret.next;
                //System.out.println("insert.next.val:"+insert.next.val);
                ret.next=insert;
                //System.out.println("ret.next.val:"+ret.next.val);
                ret=ret.next.next;
                //System.out.println("ret:"+ret.val);
            }
            if(ret!=null){
                ret.next=null;
            }
            return;
        }
    }
}
