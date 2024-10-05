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

    
    ListNode t1 = l1, t2 =l2 ;
    int sum = 0, carry = 0 ;
    ListNode head = new ListNode(-1);
    ListNode temp = head ,newNode;
    while(t1!=null || t2!=null )
    { 
        sum = 0 ;
        if(t1!=null)
         { sum += t1.val ;
           t1=t1.next ; 
         } 
        if(t2!=null)
        {
          sum += t2.val ;
          t2=t2.next ; 
        }
          sum +=carry ;

           newNode = new ListNode(sum%10);
          carry = sum/10;
          
          temp.next = newNode;
          temp = newNode ;


    }

     if(carry!= 0)
     {  newNode = new ListNode(carry);
        temp.next = newNode;
     }
     return head.next ; 


    }
}