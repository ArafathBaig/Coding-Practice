package BoundaryOrderTraversal;

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if(!currVal.equals("N"))
            {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= s.length)
                break;
            currVal = s[i];

            // If the right child is not null
            if(!currVal.equals("N"))
            {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList <Integer> res = T.printBoundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution
{
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    ArrayList <Integer> printBoundary(Node node)
    {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Integer> res = new ArrayList<>();

        traverse(node,0,map,res);

        for(int i = 0 ; i >= min ; i--){

            ArrayList<Integer> temp = map.get(i);

            if(temp.size() > 0){
                res.add(temp.get(0));
            }
        }


        for(int i = min ; i <= max ; i++){

            ArrayList<Integer> temp = map.get(i);

            if(temp.size() > 1){
                res.add(temp.get(temp.size()-1));
            }
        }


        for(int i = max ; i > 0 ; i--){

            ArrayList<Integer> temp = map.get(i);

            if(temp.size() > 0){
                res.add(temp.get(0));
            }
        }


        return res;

    }

    private void traverse(Node node, int val, Map<Integer, ArrayList<Integer>> map, ArrayList<Integer> res){


        if(node == null)
            return;

        if(!map.containsKey(val)){
            map.put(val, new ArrayList<>());
        }

        map.get(val).add(node.data);

        traverse(node.left, val-1,map, res);

        traverse(node.right, val+1,map, res);

        min = Math.min(min, val);
        max = Math.max(max, val);
    }
}

