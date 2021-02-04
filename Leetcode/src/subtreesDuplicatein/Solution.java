package subtreesDuplicatein;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        Map<String,Integer> map = new HashMap<>();

        List<TreeNode> list = new ArrayList<>();

        traverse(root, map, list);

        return list;

    }

    private StringBuilder traverse(TreeNode root, Map<String, Integer> map, List<TreeNode> list){

        if(root == null)
            return new StringBuilder("N");

        StringBuilder sb = new StringBuilder();

        sb.append(root.val).append("-").append(traverse(root.left, map, list)).append("-").append(traverse(root.right,map,list));

        String s = sb.toString();
        //System.out.println(s);

        if(map.containsKey(s) && map.get(s) == 0){
            list.add(root);
            map.put(s,1);
        }

        if(!map.containsKey(s))
            map.put(s,0);


        return sb;
    }
}