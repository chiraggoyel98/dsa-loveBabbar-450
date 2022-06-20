/*
Leetcode 83. Remove Duplicates from Sorted List
Description : Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Solution in java 
Since the list is sorted alrewady we need to compare only adjacent elements of list
Strat from head -> maintain a check if node!=null also next node is also not null
we need the previous node in order to delete the next duplicate node
if curr node value is equal to next node value 
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        
        while(node!=null && node.next!=null) {
            if(node.val!=node.next.val) {
                node = node.next;
            }else{
                node.next = node.next.next;
            }
            
        }
        return head;
    }
}
