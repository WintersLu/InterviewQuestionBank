package LeetCode;

import java.util.ArrayList;

public class UniqueBinarySearchTreesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<TreeNode> generateTrees(int n) {
		return recurTree(1, n);
	}

	public static ArrayList<TreeNode> recurTree(int left, int right) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if (left > right) {
			TreeNode empty = null;
			result.add(empty);
			return result;
		}

		for (int i = left; i <= right; i++) {
			ArrayList<TreeNode> leftList = recurTree(left, i - 1);
			ArrayList<TreeNode> rightList = recurTree(i + 1, right);
			for (TreeNode l : leftList) {
				for (TreeNode r : rightList) {
					TreeNode top = new TreeNode(i);
					top.left = l;
					top.right = r;
					result.add(top);
				}
			}
		}
		return result;

	}

}
