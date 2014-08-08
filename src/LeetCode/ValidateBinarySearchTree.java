package LeetCode;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {

		return recurValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean recurValid(TreeNode root, int max, int min) {
		if (root == null)
			return true;

		if (root.val >= min)
			return false;
		if (root.val <= max)
			return false;

		return recurValid(root.left, max, root.val)
				&& recurValid(root.right, root.val, min);

	}

}
