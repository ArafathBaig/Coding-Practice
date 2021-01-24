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
class Solution2 {
    public ListNode reverseList(ListNode head) {

        return rev(head,null);
    }

    private ListNode rev(ListNode cur, ListNode prev){

        if(cur == null)
            return prev;

        ListNode next = cur.next;
        cur.next = prev;
        prev = cur;
        return rev(next, prev);
    }
}