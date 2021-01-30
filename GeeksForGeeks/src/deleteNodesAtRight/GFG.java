package deleteNodesAtRight;

import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{



    /* Function to print linked list */
    public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();

            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new GfG().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class GfG
{
    Node compute(Node head)
    {
        // your code here
        Stack<Integer> stack = new Stack();

        Node temp = head;

        while(temp != null){

            while(!stack.isEmpty() && stack.peek() < temp.data){
                stack.pop();
            }

            stack.push(temp.data);
            temp = temp.next;
        }

        if(stack.isEmpty())
            return head;

        Node ans = new Node(stack.pop());
        temp = ans;
        while(!stack.isEmpty()){
            temp.next = new Node(stack.pop());
            temp = temp.next;
        }

        Node prev = null;

        while(ans != null){

            Node next = ans.next;
            ans.next = prev;
            prev = ans;
            ans = next;
        }

        return prev;
    }
}

