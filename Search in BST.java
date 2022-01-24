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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode foundNode = root;
        while (foundNode != null){
            if (foundNode.val > val){
                foundNode = foundNode.left;
            }
            else{
                if (foundNode.val == val)return foundNode;
                foundNode = foundNode.right;
            }
        }
        return null;
    }
}
