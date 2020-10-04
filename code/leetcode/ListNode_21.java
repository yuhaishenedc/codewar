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
    /*
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* head=new ListNode();
        ListNode* tmp=head;
        while(l1!=NULL&&l2!=NULL){
            cout<<"l1:"<<l1->val<<" l2:"<<l2->val<<endl;
            if(l1->val<l2->val){
                tmp->next=l1;
                l1=l1->next;
            }
            else{
                tmp->next=l2;
                l2=l2->next;
            }
            tmp=tmp->next;
        }
        if(l1!=NULL){
            tmp->next=l1;
        }
        else{
            tmp->next=l2;
        }
        return head->next;
    }
};
     */
}
