package LeetCode;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDistance(String word1, String word2) {

		int[][] changeMatrix = new int[word1.length() + 1][word2.length() + 1];
		for (int i = 0; i < word1.length() + 1; i++) {
			for (int j = 0; j < word2.length() + 1; j++) {
				if (i == 0)
					changeMatrix[i][j] = j;
				else if (j == 0)
					changeMatrix[i][j] = i;
				else {
					if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
						changeMatrix[i][j] = changeMatrix[i - 1][j - 1];
					} else {
						int replace = changeMatrix[i - 1][j - 1] + 1;
						int delete = changeMatrix[i - 1][j] + 1;
						int add = changeMatrix[i][j - 1] + 1;
						changeMatrix[i][j] = Math.min(add,
								Math.min(replace, delete));
					}
				}
			}
		}
		return changeMatrix[word1.length()][word2.length()];

	}

}
