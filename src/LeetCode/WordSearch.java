package LeetCode;

public class WordSearch {

	public static void main(String[] args) {
		char[][] input = {{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
		WordSearch w = new WordSearch();
		w.exist(input, "SEE");
	}
	
	public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(dfs(board, i, j, word)) return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, int i, int j, String word){
        if(word.length() == 1 && board[i][j] == word.charAt(0)) return true;
        if(board[i][j] != word.charAt(0) || board[i][j] == '0') return false;
        
        char tmp = board[i][j];
        board[i][j] = '0';
        if(i > 0 && dfs(board, i-1, j, word.substring(1))) return true;
        if(j > 0 && dfs(board, i, j-1, word.substring(1))) return true;
        if(i < board.length-1 && dfs(board, i+1, j, word.substring(1))) return true;
        if(j < board[0].length-1 && dfs(board, i, j+1, word.substring(1))) return true;
        board[i][j] = tmp;
        return false;
    }

}
