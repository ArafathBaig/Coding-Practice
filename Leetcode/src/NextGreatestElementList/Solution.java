package NextGreatestElementList;

import java.util.Stack;

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
    public int[] nextLargerNodes(ListNode head) {

        int count = 0;

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode next = temp.next;

            temp.next = prev;
            prev= temp;
            temp = next;

            count++;
        }

        int res[] = new int[count];

        Stack<Integer> stack = new Stack();

        temp = prev;
        int index = count-1;
        while(temp != null){

            while(!stack.isEmpty() && stack.peek() <= temp.val){
                stack.pop();
            }

            res[index] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(temp.val);
            temp = temp.next;
            index--;
        }

        return res;
    }
}