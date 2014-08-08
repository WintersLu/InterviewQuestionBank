package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return result;
		return recurPath(result, list, root, sum, 0);
	}

	@SuppressWarnings("unchecked")
	public List<List<Integer>> recurPath(List<List<Integer>> result,
			ArrayList<Integer> list, TreeNode node, int sum, int preSum) {
		list.add(node.val);
		preSum += node.val;
		if (node.left == null && node.right == null && preSum == sum) {
			result.add(list);
			return result;
		}
		if (node.left != null)
			result = recurPath(result, (ArrayList<Integer>) list.clone(),
					node.left, sum, preSum);
		if (node.right != null)
			result = recurPath(result, (ArrayList<Integer>) list.clone(),
					node.right, sum, preSum);
		return result;
	}

}
