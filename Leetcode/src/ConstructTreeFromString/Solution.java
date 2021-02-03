package ConstructTreeFromString;

import javax.swing.tree.TreeNode;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param s: a string
     * @return: a root of this tree
     */
    int ind = 0;
    public TreeNode str2tree(String s) {
        // write your code here
        ind = 0;

        return traverse(s);
    }

    private TreeNode traverse(String s){

        if(ind >= s.length() || s.charAt(ind) == ')'){
            return null;
        }

        if(s.charAt(ind) == '(')
            ind++;

        StringBuilder val = new StringBuilder();
        while(ind < s.length() && s.charAt(ind) != ')' && s.charAt(ind) !='(')
            val.append(s.charAt(ind++));

        int num = Integer.parseInt(val.toString());

        TreeNode root = new TreeNode(num);

        if(ind >= s.length() || s.charAt(ind) == ')'){
            ind++;
            return root;
        }

        root.left = traverse(s);

        root.right = traverse(s);

        ind++;

        return root;



    }
}
