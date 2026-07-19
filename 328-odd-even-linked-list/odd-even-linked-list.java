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
        if (head == null) return null;
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);

        ListNode even_temp=even;
        ListNode odd_temp=odd;

        ListNode temp=head;

        while(temp!=null){
                odd_temp.next=temp;
                temp=temp.next;
                odd_temp=odd_temp.next;

                even_temp.next=temp;
                if(temp==null) break;
                temp=temp.next;
                even_temp=even_temp.next;
            }
        
        odd=odd.next;
        even=even.next;
        odd_temp.next=even;
        return odd;
    }
}