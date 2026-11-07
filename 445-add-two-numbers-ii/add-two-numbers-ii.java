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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1=reverse(l1);
        l2=reverse(l2);


        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int car=0;

        while(l1!=null || l2!=null || car>0){
            int sum=car;
            if(l1!=null){
            sum+=l1.val;
            l1=l1.next;

            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;

            }
            car=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
        }
        return reverse(dummy.next);

    }
    public ListNode reverse(ListNode head){
       if(head==null || head.next== null){
        return head;
       }

       ListNode newhead=reverse(head.next);

        head.next.next=head;

        head.next=null;

        return newhead;

    }
}