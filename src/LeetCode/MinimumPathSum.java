package LeetCode;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int minPathSum(int[][] grid) {
        int[] row = new int[grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i==0 && j==0) row[j] = grid[0][0];
                else if(j==0) row[j] = row[j] + grid[i][0];
                else if(i==0) row[j] = row[j-1] + grid[0][j];
                else row[j] = grid[i][j] + Math.min(row[j], row[j-1]);
            }
        }
        return row[grid[0].length-1];
    }

}
