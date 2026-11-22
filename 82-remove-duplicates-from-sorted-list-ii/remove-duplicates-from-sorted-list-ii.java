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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = head;
        ListNode search= head;
        ListNode prev=new ListNode(-1);
       
        while(dummy!=null){
            if(dummy.next!=null && dummy.val==dummy.next.val){

                search=dummy;
                while(search!=null && search.val==dummy.val){
                    search=search.next;
                }
            
                prev.next=search;
                if(dummy.val==head.val){
                    head=prev.next;
                }
                dummy=search;
                continue;
            }
            prev=dummy;
            dummy=dummy.next;
        }
        return head;
    }
   
}