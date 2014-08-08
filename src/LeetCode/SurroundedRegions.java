package LeetCode;

import java.util.LinkedList;

public class SurroundedRegions {

	public static void main(String[] args) {
		// char[][] input = {{'x','x','x','x'},
		// {'x','o','o','x'},
		// {'x','x','o','x'},
		// {'x','o','x','x'}};
		char[][] input = { { 'x', 'x', 'x' }, { 'x', 'o', 'x' },
				{ 'x', 'x', 'x' } };
		SurroundedRegions s = new SurroundedRegions();
		s.solve(input);
		return;
	}

	public void solve(char[][] board) {
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[0].length; x++) {
				if (x == 0 || x == board[0].length - 1 || y == 0
						|| y == board.length - 1)
					recursion(board, x, y);
			}
		}

		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[0].length; x++) {
				if (board[y][x] == 'O')
					board[y][x] = 'X';
				if (board[y][x] == '1')
					board[y][x] = 'O';
			}
		}
	}

	public void recursion(char[][] board, int x, int y) {
		if (board[y][x] != 'O')
			return;
		else
			board[y][x] = '1';

		LinkedList<Integer> queue = new LinkedList<Integer>();
		int code = y * board[0].length + x;
		queue.offer(code);
		while (!queue.isEmpty()) {
			code = queue.poll();
			int row = code / board[0].length;
			int col = code % board[0].length;
			if (row > 0 && board[row - 1][col] == 'O') {
				queue.offer((row - 1) * board[0].length + col);
				board[row - 1][col] = '1';
			}
			if (row < board.length - 1 && board[row + 1][col] == 'O') {
				queue.offer((row + 1) * board[0].length + col);
				board[row + 1][col] = '1';
			}
			if (col > 0 && board[row][col - 1] == 'O') {
				queue.offer(row * board[0].length + col - 1);
				board[row][col - 1] = '1';
			}
			if (col < board[0].length - 1 && board[row][col + 1] == 'O') {
				queue.offer(row * board[0].length + col + 1);
				board[row][col + 1] = '1';
			}
		}
	}

}
