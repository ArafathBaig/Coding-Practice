/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack= new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){

            while(root != null && root.left != null){
                root = root.left;
                stack.push(root);
            }

            TreeNode temp = stack.pop();
            k--;

            if(k == 0)
                return temp.val;

            if(temp.right != null){
                stack.push(temp.right);
            }

            root = temp.right;

        }

        return -1;
    }
}