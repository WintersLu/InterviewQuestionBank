package Interview;

import java.util.List;

public class Coursera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int fib3(int index){

	    if(index == 0) return 0;
	    if(index == 1 || index == 2) return 1;
	    
	    int num1 = 0, num2 = 1, num3 = 1;
	    for(int i=3; i<= index; i++){
	        int tmp = num3;
	        num3 = num1 + num2 + tmp;
	        num1 = num2;
	        num2 = tmp;
	    }
	    return num3;
	}
	
	
	
	
//	EECA
//	ALEP
//	HNBO
//	QTTY
//
//	ACE
//	PACE
//	BOP
//	BOY
//	CAPE
//	POP !!!
	
	public void printWords(List<String> words, char[][] board){
	    
	    if(words == null || words.size() == 0 || board == null || board.length == 0)
	        return;
	    
	    for(String word: words){
	        for(int i=0; i<board.length; i++){
	            for(int j=0; j<board[0].length; j++){
	                dfs(board, i, j, word, 0);
	            }
	        }
	    }
	    return;
	}


	public void dfs(char[][] board, int i, int j, String word, int index){
	    if(board[i][j] == '~') return;
	    if(index == word.length()-1 && word.charAt(index) == board[i][j]){
	        System.out.println(word);
	        return;
	    }
	    if(index == word.length()-1 && word.charAt(index) != board[i][j])
	        return;
	    
	    char tmp = board[i][j];
	    board[i][j] = '~';
	    if(i > 0) dfs(board, i-1, j, word, index+1);
	    if(j > 0) dfs(board, i, j-1, word, index+1);
	    if(i < board.length-1) dfs(board, i+1, j, word, index+1);
	    if(j < board[0].length-1) dfs(board, i, j+1, word, index+1);
	    board[i][j] = tmp;
	    return;   
	}
	

}
