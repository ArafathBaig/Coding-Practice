package AddTwoNumbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry =0;
        while(l1 != null || l2 != null){

            int val1 =0, val2 = 0;
            if(l1 != null){
                val1+= l1.val;
                l1 = l1.next;
            }

            if(l2!= null){
                val2+= l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode((val1+val2+carry)%10);
            carry = (carry+val1+val2) > 9 ? 1 : 0;

            temp = temp.next;
        }

        if(carry == 1){
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
