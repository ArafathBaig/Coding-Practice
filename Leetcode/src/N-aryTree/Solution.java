/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        Queue<Node> q = new LinkedList();
        List<List<Integer>> list = new ArrayList();

        if (root == null)
            return list;
        List<Integer> include = new ArrayList();
        q.add(root);
        int level = 1, current = 0;
        while (!q.isEmpty()) {
            Node temp = q.remove();
            level--;
            include.add(temp.val);

            for (Node e : temp.children) {
                q.add(e);
                current++;
            }

            if (level == 0) {
                level = current;
                current = 0;
                list.add(new ArrayList(include));
                include.clear();
            }
        }

        return list;
    }
}