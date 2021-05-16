/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        boolean zigzag = false;

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                TreeNode currentNode = queue.poll();

                tempList.add(currentNode.val);

                if (currentNode.left != null)
                    queue.add(currentNode.left);

                if (currentNode.right != null)
                    queue.add(currentNode.right);

            }

            if (zigzag)
                Collections.reverse(tempList);

            result.add(tempList);
            zigzag = !zigzag;
        }

        return result;
    }
}