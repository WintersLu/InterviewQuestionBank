package LeetCode;

public class MaximalRectangle {

	public static void main(String[] args) {
		char[][] matrix = {{'0','1'},{'0','1'}};
		MaximalRectangle m = new MaximalRectangle();
		m.maximalRectangle(matrix);
	}

	public int maximalRectangle(char[][] matrix) {
		if(matrix == null || matrix.length==0 || matrix[0].length == 0) return 0;
		int[][] width = new int[matrix.length][matrix[0].length];
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] =='1') 
					if(j==0) width[i][j] = 1;
					else width[i][j] = width[i][j-1]+1;
			}
		}
		int result = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(width[i][j]!=0){
					int minWidth = width[i][j];
					for(int k=i;k>=0; k--){
						minWidth = Math.min(minWidth, width[k][j]);
						result = Math.max(result, minWidth * (i-k+1));
					}
				}
			}
		}
		return result;
	}

}
