package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<List<Integer>> preResult = new ArrayList<List<Integer>>();
		List<Integer> level = new ArrayList<Integer>();
		if (root == null)
			return result;

		int currentLevel = 1;
		int nextLevel = 0;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			level.add(node.val);
			currentLevel--;

			if (node.left != null) {
				queue.offer(node.left);
				nextLevel++;
			}
			if (node.right != null) {
				queue.offer(node.right);
				nextLevel++;
			}
			if (currentLevel == 0) {

				currentLevel = nextLevel;
				nextLevel = 0;
				preResult.add(level);
				level = new ArrayList<Integer>();
			}
		}

		for (int i = preResult.size() - 1; i >= 0; i--) {
			result.add(preResult.get(i));
		}
		return result;

	}

}
