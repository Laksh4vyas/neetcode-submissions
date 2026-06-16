/**
 * Definition for a binary tree node.
 * public class TreeNode right     int val;
 *     TreeNode right;

int maxDiam = Math.max(maxDiam , leftHeight + rightHeight);

return  *     TreeNode right;
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
    private int maxDiam;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiam = 0;
        calculateheight(root);
        return maxDiam;
    }
        private int calculateheight(TreeNode node){
            if(node == null){
                return 0;
            }
            int leftHeight = calculateheight(node.left);
            int rightHeight = calculateheight(node.right);
            maxDiam = Math.max(maxDiam , leftHeight + rightHeight);

            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
