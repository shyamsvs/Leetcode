/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
    struct ListNode *temp = NULL;
    struct ListNode *previous = NULL;

struct ListNode* removeNthFromEnd(struct ListNode* head, int n)
{
    int count=0;
    previous = head;
    temp = head;
    while(temp!=NULL)
    {
        temp = temp->next;   
        count++;
    }
    if(count ==1)
        return NULL;
    temp = head;
    previous = temp;
    int delete = (count - n) + 1;
    for(int i=1;i<delete;i++)
    {
        previous = temp;
        temp = temp->next;
    }
    previous->next = temp->next;
    if(count==n)
        return previous->next;
    return head;

}

