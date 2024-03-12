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
    public ListNode removeZeroSumSublists(ListNode head) {
          
          ListNode dummy = new ListNode();
          dummy.val=0;
          dummy.next=head;
          Map< Integer , ListNode > map = new HashMap<>();
           map.put(0,dummy);

          int sum = 0;
          while(head!=null)
          {  
              sum += head.val;
               
              if(map.containsKey(sum))
              {
              //remove
                int pSum=sum;
                ListNode start = map.get(sum);
                ListNode temp = start;
             
                while( temp!=head )
                {
                     temp = temp.next;
                     pSum += temp.val;

                    if( temp!=head)
                      map.remove(pSum);
                    
                    
                }
                start.next=head.next;
                head=head.next;

                
              }
               else 
               {  
                map.put(sum,head);
                head = head.next;

               }  
                 
              
          }


          return dummy.next;


    }
}