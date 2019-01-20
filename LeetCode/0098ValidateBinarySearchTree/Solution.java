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
  public boolean isBSTHelper(TreeNode node, Integer lower_limit, Integer upper_limit) {
    if ((lower_limit != null) && (node.val <= lower_limit))
      return false;
    if ((upper_limit != null) && (upper_limit <= node.val))
      return false;

    boolean left = node.left != null ? isBSTHelper(node.left, lower_limit, node.val) : true;
    if (left) {
      boolean right = node.right != null ? isBSTHelper(node.right, node.val, upper_limit) : true;
      return right;
    } else
      return false;
  }

  public boolean isValidBST(TreeNode root) {
    if (root == null)
      return true;

    return isBSTHelper(root, null, null);
  }

  //==============================
  //Iteration, using stack
  public boolean isValidBST(TreeNode root) {
    if (root == null)
      return true;

    LinkedList<TreeNode> stack = new LinkedList();
    LinkedList<Integer> upper_limits = new LinkedList();
    LinkedList<Integer> lower_limits = new LinkedList();
    stack.add(root);
    upper_limits.add(null);
    lower_limits.add(null);

    while (!stack.isEmpty()) {
      TreeNode node = stack.poll();
      Integer lower_limit = lower_limits.poll();
      Integer upper_limit = upper_limits.poll();
      if (node.right != null) {
        if (node.right.val > node.val) {
          if ((upper_limit != null) && (node.right.val >= upper_limit))
            return false;
          stack.add(node.right);
          lower_limits.add(node.val);
          upper_limits.add(upper_limit);
        } else
          return false;
      }

      if (node.left != null) {
        if (node.left.val < node.val) {
          if ((lower_limit != null) && (node.left.val <= lower_limit))
            return false;
          stack.add(node.left);
          lower_limits.add(lower_limit);
          upper_limits.add(node.val);
        } else
          return false;
      }
    }
    return true;
  }

}