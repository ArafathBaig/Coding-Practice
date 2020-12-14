package MaxWidthInaBinaryTree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int widthOfBinaryTree(TreeNode root) {

            int max = 0;

            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            Queue<TreeNode> treeQ = new LinkedList<>();
            treeQ.add(root);

            while (!treeQ.isEmpty()) {


                Queue<TreeNode> t = new LinkedList<>();


                int m = queue.peek();
                while (!treeQ.isEmpty()) {
                    TreeNode temp = treeQ.poll();
                    int current = queue.poll();
                    max = Math.max(max, current - m + 1);

                    if (temp.left != null) {
                        t.add(temp.left);
                        queue.add(current * 2);
                    }

                    if (temp.right != null) {
                        t.add(temp.right);
                        queue.add(current * 2 + 1);
                    }
                }
                // System.out.println(m+" "+n);


                treeQ = t;
            }
            return (int) max;
        }
    }
