package UniqueBinarySearchTrees2;

import javax.swing.tree.TreeNode;

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

    Map<String,List<TreeNode>> map = new HashMap<>();
    public List<TreeNode> generateTrees(int n) {

        if(n==0)
            return new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int i =1 ; i<= n;i++){
            sb.append(i);
        }

        return generateTrees(sb.toString());
    }

    private List<TreeNode> generateTrees(String s){


        List<TreeNode> list = new ArrayList<>();
        if(s.length() == 0){
            list.add(null);
            map.put(s, list);
            return list;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }else if(s.length() == 1 ){
            TreeNode node = new TreeNode(Integer.parseInt(String.valueOf(s.charAt(0))));
            list.add(node);
            map.put(s,list);
        }else{
            for(int i = 0; i < s.length(); i++){
                List<TreeNode> left = generateTrees(s.substring(0,i));
                List<TreeNode> right = generateTrees(s.substring(i+1));
                int n = Integer.parseInt(String.valueOf(s.charAt(i)));
                for(TreeNode l : left){
                    for(TreeNode r : right){
                        TreeNode node = new TreeNode(n);

                        node.left = l;
                        node.right = r;

                        list.add(node);

                    }
                }
            }
            map.put(s,list);

        }


        return map.get(s);
    }
}