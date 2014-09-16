package Linkedin;

import LeetCode.TreeNode;

public class MirrorTree {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		node6.left = node7;
		node6.right = node8;
		TreeNode result = MirrorTree.mirror(node1);
		@SuppressWarnings("unused")
		TreeNode nodex = result;
		
	}
	
	
	public static TreeNode mirror(TreeNode node){
		if(node == null) return null;
		TreeNode newNode = new TreeNode(node.val);
		
		newNode.left = mirror(node.right);
		newNode.right = mirror(node.left);
		
		return newNode;
		
	}

}
