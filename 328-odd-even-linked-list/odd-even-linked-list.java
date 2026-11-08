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
    public ListNode oddEvenList(ListNode head) {
      
        ListNode l1=new ListNode(0);
        

        ListNode l2= new ListNode(0);
     

        ListNode head1=l1;
        ListNode head2=l2;
        
        
        ListNode temp=head;
        ListNode l3=new ListNode(0);
        ListNode ans=l3;
        int gate=0;

        while(temp!=null){
            if(gate==0){
                l1.next=new ListNode(temp.val);
                l1=l1.next;
                gate=1;
                temp=temp.next;
                continue;
            }

            if(gate==1){
                l2.next=new ListNode(temp.val);
                l2=l2.next;
                gate=0;
                temp=temp.next;
                continue;

                            }
        }
        gate=0;
        ListNode tempp=l3;
        head1=head1.next;
        head2=head2.next;
        while(head1!=null){
            l3.next=new ListNode(head1.val);
            l3=l3.next;
            head1=head1.next;

        }
        while(head2!=null){
            l3.next=new ListNode(head2.val);
            l3=l3.next;
            head2=head2.next;

        }
        return ans.next;
    }
}
