/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1 || head == null)
            return head;

        ListNode current = head;
        ListNode previous = null;

        while (true) {
            ListNode firstNode = previous;
            ListNode lastNode = current;
            ListNode next = null;

            for (int i = 0; current != null && i < k; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            if (firstNode != null) {
                firstNode.next = previous;
            } else {
                head = previous;
            }

            lastNode.next = current;
            previous = lastNode;

            ListNode check = lastNode;
            for (int i = 0; check != null && i < k; i++) {
                check = check.next;
            }

            if (check == null)
                break;
        }

        return head;
    }

}