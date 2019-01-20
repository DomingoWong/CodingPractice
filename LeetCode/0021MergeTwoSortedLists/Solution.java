/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        while (pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                temp.next = pointer2;
                temp = temp.next;
                pointer2 = pointer2.next;
            } else if (pointer2 == null) {
                temp.next = pointer1;
                temp = temp.next;
                pointer1 = pointer1.next;
            } else if (pointer1.val < pointer2.val) {
                temp.next = pointer1;
                temp = temp.next;
                pointer1 = pointer1.next;
            } else {
                temp.next = pointer2;
                temp = temp.next;
                pointer2 = pointer2.next;
            }
        }
        return result.next;
    }
}