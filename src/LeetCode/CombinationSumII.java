package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		CombinationSumII c = new CombinationSumII();
		int[] input = { 1, 2 };
		c.combinationSum2(input, 2);

	}

	public List<List<Integer>> combinationSum2(int[] num, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> line = new ArrayList<Integer>();
		if (num.length == 0)
			return result;
		Arrays.sort(num);
		result = dfs(result, line, num, 0, target);
		return result;
	}

	public List<List<Integer>> dfs(List<List<Integer>> result,
			List<Integer> line, int[] num, int index, int target) {
		if (target == 0) {
			result.add(line);
			return result;
		}
		if (index >= num.length || num[index] > target)
			return result;
		

		for (int i = index; i < num.length; i++) {
			if (i > index && num[i] == num[i - 1])
				continue;
			List<Integer> newLine = new ArrayList<Integer>(line);
			newLine.add(num[i]);
			result = dfs(result, newLine, num, i + 1, target - num[i]);
		}
		return result;
	}

}
