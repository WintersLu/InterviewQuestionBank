package LeetCode;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void solveSudoku(char[][] board) {
		if(board == null) return;
		dfs(board, 0, 0);
	}
	
	public boolean dfs(char[][] board, int i, int j){
		if(j>=9) return dfs(board, i+1, 0);
		if(i==9) return true;
		if(board[i][j] != '.') return dfs(board, i, j+1);
		
		for(int n=1; n<10; n++){
			board[i][j] = (char)(n+'0');
			if(isValid(board, i, j))
			{
				if(dfs(board, i, j+1)) return true;
			}
			board[i][j] = '.';
		}
		
		return false;
		
	}
	
	public boolean isValid(char[][] board, int x, int y){
		
		for(int i=0; i<9; i++){
			if( i!= y && board[x][i] == board[x][y])
				return false;
		}
		for(int i=0; i<9; i++){
			if(i!=x && board[i][y] == board[x][y])
				return false;
		}
		int m=x/3, n=y/3;
		for(int i=m*3; i<(m+1)*3; i++){
			for(int j=n*3; j<(n+1)*3; j++){
				if( (i!=x || j!=y) && board[i][j] == board[x][y] )
					return false;
			}
		}
		return true;
	}

}
