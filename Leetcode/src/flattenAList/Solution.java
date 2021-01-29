package flattenAList;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

import org.w3c.dom.Node;

class Solution {
    public Node flatten(Node head) {

        Node temp = head;
        while(temp!= null){

            while(temp!= null && temp.child == null){
                temp = temp.next;
            }

            if(temp != null){

                Node next = temp.next;

                Node prev = null;

                Node childTemp = temp.child;
                childTemp.prev = temp;

                while(childTemp!= null){
                    prev = childTemp;
                    childTemp = childTemp.next;
                }

                temp.next = temp.child;
                prev.next = next;

                if(next != null)
                    next.prev = prev;

                temp.child = null;
            }

        }

        return head;

    }
}
