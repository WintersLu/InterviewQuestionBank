package LeetCode;

import java.util.Arrays;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValidSudoku(char[][] board) {
        boolean[] check = new boolean[10];
        for(int i=0; i<board[0].length; i++){
            Arrays.fill(check, false);
            for(int j=0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(check[Character.getNumericValue(board[j][i])])
                        return false;
                    else check[Character.getNumericValue(board[j][i])] = true;
                }
            }
        }
        for(int i=0; i<board.length; i++){
            Arrays.fill(check, false);
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(check[Character.getNumericValue(board[i][j])])
                        return false;
                    else check[Character.getNumericValue(board[i][j])] = true;
                }
            }
        }
        for(int i=0; i<board.length; i++){
            Arrays.fill(check, false);
            for(int j=0; j<board[0].length; j++){
                if(board[j/3 + i/3*3][j%3 + i%3*3] != '.'){
                    if(check[Character.getNumericValue(board[j/3 + i/3*3][j%3 + i%3*3])])
                        return false;
                    else check[Character.getNumericValue(board[j/3 + i/3*3][j%3 + i%3*3])] = true;
                }
            }
        }
        return true;
    }

}
