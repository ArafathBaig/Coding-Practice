/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> leafPathResult = new ArrayList<>();

        if (root == null)
            return leafPathResult;

        treeTraversal(leafPathResult, root, targetSum, new ArrayList<>());

        return leafPathResult;
    }

    private TreeNode treeTraversal(List<List<Integer>> result, TreeNode root, int target, List<Integer> path) {

        if (root == null)
            return null;

        path.add(root.val);

        TreeNode left = treeTraversal(result, root.left, target - root.val, path);
        TreeNode right = treeTraversal(result, root.right, target - root.val, path);

        if (left == null && right == null && target - root.val == 0)
            result.add(new ArrayList<>(path));

        path.remove(path.size() - 1);

        return root;

    }
}