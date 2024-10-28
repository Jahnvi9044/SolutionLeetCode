/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:

    ListNode* reverse(ListNode* curr, ListNode* pre){
        if(curr==NULL){
            return pre;
        }
        ListNode* temp = curr->next;
        curr->next = pre;
        pre = curr;
        curr = temp;
        return reverse(curr, pre);
    }
    ListNode* reverseList(ListNode* head) {
        ListNode* curr = head;
        ListNode* pre = NULL;

      return  reverse(curr, pre);
          
    } 
};