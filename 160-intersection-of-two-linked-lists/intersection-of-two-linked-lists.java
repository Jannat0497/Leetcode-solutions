/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int l1=0;
        int l2=0;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(l1>l2){
            int diff=l1-l2;
            for(int i=1;i<=diff;i++){
                temp1=temp1.next;
            }
        }
        else{
            int diff=l2-l1;
            for(int i=1;i<=diff;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}