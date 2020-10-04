package leetcode;

public class LinkedList_Offer_18 {
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode cur=head;
            ListNode pre=null;
            while(cur.val!=val){
                pre=cur;
                cur=cur.next;
            }
            if(cur==head){
                head=head.next;
            }
            else{
                pre.next=cur.next;
            }
            return head;
        }
    }
    /*
class Solution {
public:
    ListNode* deleteNode(ListNode* head, int val) {
        if(head->val==val){
            return head->next;
        }
        ListNode* tmp=head;
        ListNode* prev=NULL;
        while(tmp->val!=val){
            prev=tmp;
            tmp=tmp->next;
        }
        prev->next=tmp->next;
        return head;

    }
};
     */
}
