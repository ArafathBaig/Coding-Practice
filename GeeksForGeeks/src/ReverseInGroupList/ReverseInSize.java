// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }

            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node curr = node;
        Node res = null;
        Node groupPrev = null;
        while(curr != null){

            int count = 0;
            Node prev = null;
            Node tempHead = curr;
            do{
                count++;

//                System.out.println(curr.data);
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }while(curr != null && count % k != 0);
            if(groupPrev != null){
                groupPrev.next = prev;
            }else{
                res = prev;
            }

            groupPrev = tempHead;

        }

        return res;
    }
}

