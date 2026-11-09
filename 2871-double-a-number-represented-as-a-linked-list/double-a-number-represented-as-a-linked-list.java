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
    public ListNode doubleIt(ListNode head) {
        ListNode temp=reverse(head);
        ListNode temp1=temp;
        int mul=0;
        int car=0;
        ListNode prev=null;
        while(temp!=null){
            mul=(temp.val*2)+car;
            temp.val=mul%10;
            car=mul/10;
            prev=temp;
            temp=temp.next;
        }
        
        while(car>0){
            mul=car;
            prev.next=new ListNode(mul%10);
            car=mul/10;
            }
            return reverse(temp1);
            
        
        
        
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;

        }

        ListNode newNode =reverse(head.next);

        head.next.next=head;
        head.next=null;
        return newNode;
    }
}