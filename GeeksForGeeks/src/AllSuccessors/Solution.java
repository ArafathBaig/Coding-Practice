package AllSuccessors;

// { Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.HashSet;
import java.lang.Math;
class Node
{
    int data;
    Node left,right,next;
    Node(int d) {data = d; left =right= next= null; }
}

public class GFG2
{
    public static Node target;
    GFG2(){
        target=null;
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void print(Node root)
    {
        if(root==null)
            return;
        while(root.left!=null)
            root=root.left;
        while(root!=null){
            System.out.print(root.data+"->");
            if(root.next!=null)
                System.out.print(root.next.data+" ");
            else
                System.out.print("-1 ");
            root=root.next;
        }
    }
    /* Drier program to test above functions */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();
            GFG2 llist=new GFG2();
            Node root=null,parent=null;
            HashMap<Integer, Node> m = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                char c=sc.next().charAt(0);
                if(root==null){
                    root=new Node(a);
                    switch(c){
                        case 'L':root.left=new Node(b);
                            break;
                        case 'R':root.right=new Node(b);
                            break;
                    }
                }
                else{
                    insert(root,a,b,c);
                }
            }
            GFG obj = new GFG();
            obj.populateNext(root);
            //inorder(root);
            print(root);
            System.out.println();
        }
    }
    public static void insert(Node root,int a, int b,char c){
        if(root==null)
            return;
        if(root.data==a){
            switch(c){
                case 'L':root.left=new Node(b);
                    break;
                case 'R':root.right=new Node(b);
                    break;
            }
        }
        else{
            insert(root.left,a,b,c);
            insert(root.right,a,b,c);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


/*class Node
    {
        int data;
        Node left,right,next;
        Node(int d) {data = d; left =right= next= null; }
    }*/

class GFG
{
    public static void populateNext(Node root)
    {
        //Add your code here.
        ArrayList<Integer> list = new ArrayList<>();

        traverse(list,root);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size()-1 ;i++){
            sb.append(list.get(i)).append("->").append(list.get(i+1)).append(" ");
        }

        if(list.size() > 0){
            sb.append(list.get(list.size()-1)).append("->").append(-1);
        }

        System.out.println(sb);

    }

    private static void traverse(ArrayList<Integer> list , Node root){

        if(root == null)
            return;

        traverse(list, root.left);
        list.add(root.data);
        traverse(list,root.right);
    }
}