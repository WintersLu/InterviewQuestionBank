package Linkedin;

import LeetCode.TreeNode;

public class TreeUpsidedown {

	/**
	 * Given a binary tree where all the right nodes are leaf nodes, flip it
	 * upside down and turn it into a tree with left leaf nodes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node4.left = node5;
		node5.left = node6;
		node5.right = node7;
		TreeUpsidedown t = new TreeUpsidedown();
		TreeNode a = t.flipTree(node1);
		@SuppressWarnings("unused")
		TreeNode b = a;
		
	}

	TreeNode flipTree(TreeNode root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null)
			return root;

		TreeNode newRoot = flipTree(root.left);
		root.left.left = root.right;
		root.left.right = root;
		root.left = null;
		root.right = null;

		return newRoot;
	}

}
