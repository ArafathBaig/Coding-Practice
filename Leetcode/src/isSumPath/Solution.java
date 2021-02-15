package isSumPath;

import javax.swing.tree.TreeNode;

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {

        if(root == null)
            return false;

        if(isIdentical(head,root)){
            return true;
        }


        return isSubPath(head,root.left) || isSubPath(head,root.right);
    }

    private boolean isIdentical(ListNode head, TreeNode root){
        if(head == null)
            return true;

        if(root == null || root.val != head.val)
            return false;

        return isIdentical(head.next, root.left) || isIdentical(head.next, root.right);
    }
}
