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
    public ListNode sortList(ListNode head) {
         if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode h2=slow.next;
        slow.next=null;


        return merge(sortList(head),sortList(h2));

        

    }
   public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                dummy.next=list1;
                dummy=dummy.next;
                list1=list1.next;
            }
            else{
                dummy.next=list2;
                dummy=dummy.next;
                list2=list2.next;
            }
        }
        while(list1!=null ){
            dummy.next=list1;
            dummy=dummy.next;
            list1=list1.next;
        }
        while(list2!=null){
            dummy.next=list2;
            dummy=dummy.next;
            list2=list2.next;
        }
    return temp.next;
    }
   
}