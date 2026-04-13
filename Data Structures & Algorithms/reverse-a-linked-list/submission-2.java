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
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next; // 1  store next element
            curr.next = prev;  //curr 0 -> null aktualny wskazuje na poprzedni
            prev = curr;  // prev = 0  poprzedni teraz się staje aktualnym
            curr = temp; // curr = 1  a aktualny idzie do następnego
        }

        return prev;
    }
}
