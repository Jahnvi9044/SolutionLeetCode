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
    int no=0;
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
            no=n;    
            return removeNthFromEnd1(head);
    }

        public ListNode removeNthFromEnd1(ListNode head) 
    {

        if(head==null)
        return null;

        head.next=removeNthFromEnd1(head.next);
        no--;
        if(no==0)
        {
            return head.next;
        }
        return head;
    }
}