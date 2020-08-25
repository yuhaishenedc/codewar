package leetcode;

import java.util.*;

public class LinkedList_Offer_06 {
    class Solution {
        public int[] reversePrint(ListNode head) {
            int count=0;
            Stack<Integer> s=new Stack<>();
            while(head!=null){
                s.push(head.val);
                head=head.next;
                count++;
            }
            int[] ret=new int[count];
            for(int i=0;i<count;i++){
                ret[i]=s.pop();
            }
            return ret;
        }
    }
}
