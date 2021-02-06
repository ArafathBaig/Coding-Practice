package SerializeDeserializeTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = traverse(root).toString();

        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList(Arrays.asList(data.split(",")));
        return traverse(q);
    }

    private StringBuilder traverse(TreeNode root){

        if(root == null)
            return new StringBuilder("N");

        StringBuilder sb = new StringBuilder();
        StringBuilder left = traverse(root.left);
        StringBuilder right = traverse(root.right);

        sb.append(root.val).append(",").append(left).append(",").append(right);

        return sb;
    }

    private TreeNode traverse(Queue<String> q){
        String s = q.poll();


        if(s.equals("N")){
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s));

        root.left = traverse(q);
        root.right = traverse(q);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
