package SumRootToLeaf;

import javax.swing.tree.TreeNode;

class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        traverse(root, new StringBuilder());
        return sum;
    }

    private void traverse(TreeNode root, StringBuilder sb){
        if(root == null)
            return;

        sb.append(root.val);
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(sb.toString());
        }

        traverse(root.left, sb);
        traverse(root.right, sb);

        sb.deleteCharAt(sb.length() - 1);
    }
}
