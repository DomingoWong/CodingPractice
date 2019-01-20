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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int levelNodeNum = 1;
        int nextLevelNodeNum = levelNodeNum * 2;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> s = new LinkedList<TreeNode>();
        if (root == null) {
            return result;
        }
        s.add(root);
        //initial: levelNodeNum, nextLevelNodeNum, stack
        
        while (s.peek()!=null) {
            List<Integer> thisLevel = new ArrayList<Integer>();
            Queue<TreeNode> thisLevelNode = new LinkedList<TreeNode>();
            
            for (int i = 0; i < levelNodeNum; i++) {
                TreeNode temp = s.poll();
                thisLevel.add(temp.val);
                thisLevelNode.add(temp);
            }
            nextLevelNodeNum = levelNodeNum * 2;
            for (int i = 0; i < levelNodeNum; i++) {
                TreeNode temp = thisLevelNode.poll();
                if(temp.left == null) {
                    nextLevelNodeNum--;
                } else {
                    s.add(temp.left);
                }
                if(temp.right == null) {
                    nextLevelNodeNum--;
                } else {
                    s.add(temp.right);
                }   
            }
            result.add(thisLevel);
            levelNodeNum = nextLevelNodeNum;
        }
        return result;
    }
}