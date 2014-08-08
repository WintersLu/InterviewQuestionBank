package LeetCode;

public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxNum;

	public int maxPathSum(TreeNode root) {
		maxNum = Integer.MIN_VALUE;
		if (root == null)
			return maxNum;
		max(root);
		return maxNum;
	}

	public int max(TreeNode node) {
		if (node == null)
			return 0;
		int left = Math.max(max(node.left), 0);
		int right = Math.max(max(node.right), 0);
		maxNum = Math.max(maxNum, left + right + node.val);
		return node.val + Math.max(left, right);
	}

}
