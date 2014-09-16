package CareerCup;

import LeetCode.TreeNode;

public class ConvertBST2DoublyLinkedList {

	static class NodePair {
		TreeNode head;
		TreeNode tail;
	}

	public static void main(String[] args) {

		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;

		TreeNode result = bstToDll(n1);
	}

	public static TreeNode bstToDll(TreeNode root) {
		NodePair result = new NodePair();
		bstToDll(root, result);
		return result.head;
	}

	public static void bstToDll(TreeNode root, NodePair result) {

		if (root == null)
			return;

		bstToDll(root.left, result); // go left

		root.left = result.tail;
		if (result.head == null) {
			result.head = root;
		} else {
			result.tail.right = root;
		}

		TreeNode right = root.right;
		result.tail = root;
		root.right = null;

		bstToDll(right, result); // go right

	}

}
