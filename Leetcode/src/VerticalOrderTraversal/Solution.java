package VerticalOrderTraversal;

import javax.swing.tree.TreeNode;
import java.util.*;

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

    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        if(root == null)
            return new ArrayList<>();

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        Map<TreeNode, Integer> map = new HashMap<>();
        Map<Integer, PriorityQueue<TreeNode>> level = new HashMap<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int lev =0 ;

        while(!queue.isEmpty()){
            int size = queue.size();
            level.put(lev, new PriorityQueue<>((a,b) -> a.val - b.val));
            for(int i = 0; i < size ;i++){
                TreeNode temp = queue.poll();

                if(temp.left != null)
                    queue.add(temp.left);

                if(temp.right != null)
                    queue.add(temp.right);

                level.get(lev).add(temp);
            }

            lev++;
        }


        traverse(root,map,0);

        Map<Integer, List<Integer>> resMap = new HashMap<>();

        for(int i = 0 ;i < lev ; i++){
            PriorityQueue<TreeNode> q = level.get(i);
            while(!q.isEmpty()){
                TreeNode t = q.poll();

                int l = map.get(t);

                if(!resMap.containsKey(l)){
                    resMap.put(l,new ArrayList<>());
                }

                resMap.get(l).add(t.val);
            }
        }

        List<List<Integer>> list = new ArrayList();

        for(int i = max ; i <= min ;i++){
            list.add(new ArrayList<>(resMap.get(i)));
        }

        return list;
    }

    private void traverse(TreeNode root, Map<TreeNode, Integer> map, int val){
        if(root == null)
            return;



        map.put(root,val);
        traverse(root.left,map,val-1);
        traverse(root.right, map, val+1);

        max = Math.min(max, val);
        min = Math.max(min, val);


    }
}