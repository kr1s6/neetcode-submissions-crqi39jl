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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode newHead = head;
        if(head.next != null){
            newHead = reverseList(head.next);
            head.next.next = head;
            // 1.next = 2
            // 2.next = null <=> 1.next.next = null
        }
        head.next = null; //odcinanie starego połączeniaby nie było cyklu
        // np. 1 -> 2 -> 1 -> 2 -> ... (cykl)

        return newHead;
    }
}
