package leetcode;

public class ListNode_23 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            recur(lists,0,lists.length-1);
            if(lists.length==0){
                return null;
            }
            return lists[0];
        }

        public void recur(ListNode[] lists,int left,int right){
            if(left<right){
                int mid=(left+right)/2;
                recur(lists,left,mid);
                recur(lists,mid+1,right);
                merge(lists,left,mid);
            }
        }

        public void merge(ListNode[] lists,int left,int mid){
            lists[left]=mergeTwoLists(lists[left],lists[mid+1]);
        }

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
