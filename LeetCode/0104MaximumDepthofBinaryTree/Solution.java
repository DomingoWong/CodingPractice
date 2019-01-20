/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            //base case
            return 0;
        } else {
            //recursive solution
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return left_height > right_height ? left_height + 1 : right_height + 1;
        }
    }
}