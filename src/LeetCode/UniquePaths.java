package LeetCode;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        for(int i=0; i<m; i++){
            for(int l=0; l<n; l++){
                if(i==0) map[i][l] = 1;
                else if(l==0) map[i][l] = 1;
                else {
                    map[i][l] = map[i-1][l] + map[i][l-1];
                }
            }
        }
        return map[m-1][n-1];
    }

}
