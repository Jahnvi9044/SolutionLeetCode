/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        if(head==null)
            return false;

        while(true)
        {
            if(head.next == null)
                return false;
            if(head.val == 1e6)
                return true;
            head.val = (int)1e6;
            head = head.next;
        }
    }
}