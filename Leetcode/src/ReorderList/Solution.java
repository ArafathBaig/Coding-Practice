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

        prev.next = null;
        slow = reverse(slow);

        ListNode nextTemp = head;
        ListNode headNext = null;
        ListNode next = null;
        while (slow != null) {

            next = nextTemp.next;
            nextTemp.next = slow;

            slow = next;
            nextTemp = nextTemp.next;
        }

        if (slow != null)
            nextTemp.next = slow;

    }

    private ListNode reverse(ListNode head) {

        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;

            curr = next;
        }

        return prev;
    }
}