package MergeBetweenLists;

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int count = 0;
        ListNode temp = list1;
        ListNode prev = null;
        while(count != a){
            prev = temp;
            temp = temp.next;
            count++;
        }

        while(count != b){
            temp = temp.next;
            count++;
        }

        ListNode next = temp.next;
        prev.next = list2;

        while(list2 != null){
            prev = list2;
            list2 = list2.next;
        }

        prev.next = temp.next;

        return list1;

    }
}