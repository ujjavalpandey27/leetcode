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
    public ListNode reverseKGroup(ListNode head, int k) {
 if(head==null ||head.next==null || k==1){
        return head;
    }
    Boolean headclear=true;
    ListNode strcur=head;
    ListNode endcur=head;
    ListNode strnxt=head;
    ListNode prvend=new ListNode(-1,head);
    Boolean flag=true;
    while(flag){
        for (int i = 1; i < k; i++) {
            if(endcur==null || endcur.next==null){
            flag=false;
                break;
                }

            endcur=endcur.next;

        }
        if(flag==false)
        break;
        
        strnxt=endcur.next;
        endcur.next=null;
        reverse(strcur);
        if(headclear){
            head=endcur;
            headclear=false;
        }
        prvend.next=endcur;
        prvend=strcur;
        strcur.next=strnxt;
        strcur=strnxt;
        endcur=strcur;

    }
    return head;

}
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}