/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        do {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        } while (fast != null && fast.next != null);

        ListNode temp = null;
        if (fast == null) {
            temp = slow;
            prev.next = null;
        } else {
            temp = slow.next;
            slow.next = null;
        }

        slow = reverse(temp);

        ListNode currNext = null;
        ListNode slowNext = null;

        ListNode curr = head;
        while (curr != null && slow != null) {
            currNext = curr.next;
            slowNext = slow.next;
            curr.next = slow;
            slow.next = currNext;

            curr = currNext;
            slow = slowNext;
        }

    }

    private ListNode reverse(ListNode head) {

        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}