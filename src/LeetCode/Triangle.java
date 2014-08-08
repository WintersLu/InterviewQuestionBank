package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		List<Integer> input1 = new ArrayList<Integer>();
		List<Integer> input2 = new ArrayList<Integer>();
		
		input1.add(1);
		input2.add(2);
		input2.add(3);

		input.add(input1);
		input.add(input2);
		t.minimumTotal(input);
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int[] min = new int[triangle.size()];
		int[] preMin = new int[triangle.size()];
		for (int i = 0; i < triangle.size(); i++) {
			if (i == 0) {
				min[0] = triangle.get(0).get(0);
			}
			else{
			for (int k = 0; k < triangle.get(i).size(); k++) {
				if (k == 0)
					min[k] = preMin[k] + triangle.get(i).get(k);
				else if (k == triangle.get(i).size() - 1)
					min[k] = preMin[k - 1] + triangle.get(i).get(k);
				else
					min[k] = Math.min(preMin[k - 1], preMin[k])
							+ triangle.get(i).get(k);
			}
			}

			preMin = min.clone();
		}
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < min.length; i++) {
			if (result > min[i])
				result = min[i];
		}
		return result;
	}

}
