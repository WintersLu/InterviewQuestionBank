package LeetCode;

public class DistinctSubsequences {

	public static void main(String[] args) {
		DistinctSubsequences d = new DistinctSubsequences();
		d.numDistinct("rabbbit", "rabbit");
	}
	
	
	public int numDistincts(String S, String T) {
		int[][] table = new int[S.length() + 1][T.length() + 1];
	 
		for (int i = 0; i < S.length(); i++)
			table[i][0] = 1;
	 
		for (int i = 1; i <= S.length(); i++) {
			for (int j = 1; j <= T.length(); j++) {
				if (S.charAt(i - 1) == T.charAt(j - 1)) {
					table[i][j] += table[i - 1][j] + table[i - 1][j - 1];
				} else {
					table[i][j] += table[i - 1][j];
				}
			}
		}
	 
		return table[S.length()][T.length()];
	}
	
	
	public int numDistinct(String S, String T) {  
		  // Start typing your Java solution below  
		  // DO NOT write main() function  
		  if (S.length() == 0) {  
		    return T.length() == 0 ? 1 : 0;  
		  }  
		  if (T.length() == 0) {  
		    return 1;  
		  }  
		  int cnt = 0;  
		  for (int i = 0; i < S.length(); i++) {  
		    if (S.charAt(i) == T.charAt(0)) {  
		      cnt += numDistinct(S.substring(i + 1), T.substring(1));  
		    }  
		  }  
		  return cnt;  
		}

}
