package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		boolean left2right = true;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Stack<TreeNode> current = new Stack<TreeNode>();

		if (root == null)
			return result;

		current.push(root);
		while (!current.empty()) {
			Stack<TreeNode> next = new Stack<TreeNode>();
			ArrayList<Integer> row = new ArrayList<Integer>();
			while (!current.empty()) {
				TreeNode node = current.pop();
				row.add(node.val);
				if (left2right) {
					if (node.left != null)
						next.push(node.left);
					if (node.right != null)
						next.push(node.right);
				} else {
					if (node.right != null)
						next.push(node.right);
					if (node.left != null)
						next.push(node.left);
				}
			}
			current = next;
			result.add(row);
			left2right = !left2right;
		}
		return result;

	}

}
