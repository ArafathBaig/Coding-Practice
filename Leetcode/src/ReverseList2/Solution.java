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
    public ListNode reverseBetween(ListNode head, int m, int n) {


        int count = 1;

        ListNode curr = head;
        ListNode countPrev = null;
        while(count < m){
            count++;
            countPrev = curr;
            curr = curr.next;
        }

        if(countPrev != null)
            countPrev.next = null;

        ListNode temp = curr;
        ListNode prev = null;
        while(count <= n){
            count++;
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp.next = curr;

        if(countPrev != null)
            countPrev.next = prev;


        return m == 1 ? prev : head;

    }
}