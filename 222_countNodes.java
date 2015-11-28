/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public int countNodes(TreeNode root) {
    	if(root == null) return 0;
    	int heightL = 0, heightR = 0;
    	TreeNode left = root, right = root;
    	while(left != null){
    		heightL++;
    		left = left.left;
    	}
    	while(right != null){
    		heightR++;
    		right = right.right;
    	}
    	if(heightL == heightR) return (1 << heightL) - 1;
    	else return countNodes(root.left) + countNodes(root.right) + 1;
    }
}