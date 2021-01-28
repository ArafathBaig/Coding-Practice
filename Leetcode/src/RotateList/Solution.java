package RotateList;
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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null)
            return head;

        int count = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        int rotate = count-(k % count);

        if(rotate == count){
            return head;
        }

        ListNode prev = null;
        ListNode next = head;
        while(rotate != 0){
            rotate--;
            prev = next;
            next = next.next;
        }

        prev.next = null;
        temp = next;

        while(next!= null){
            prev = next;
            // System.out.println(prev.val);
            next = next.next;
        }

        prev.next = head;

        return temp;

    }
}