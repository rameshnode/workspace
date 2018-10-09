package ramesh.samples.recursive;

public class NQueens {

	public static void main(String args[]) {

		int N = 4;
		boolean board[][] = new boolean[N][N];

		showBoard(board);
		solveNQueen(board, 4, 0);
		showBoard(board);
		/*
		 * System.out.println(" b placeNQueen ");
		 * 
		 * board[0][3]=true; placeNQueen(board);
		 * 
		 * System.out.println(" a placeNQueen "); showBoard(board);
		 */

	}

	public static boolean placeQueen(boolean[][] board, int row, int n) {
		if (n == row) {

			return true;
		}
		int col = 0;
		for (; col < board.length; col++) {
			board[row][col] = true;

			if (isSafe(row, col, board) && placeQueen(board, n - 1, row + 1)) {

				return true;

			}

		}
		board[row][col] = false;
		
		
		return false;

	}

	public static void placeNQueen(boolean[][] board) {

		int n = 4;
		while (n > 0) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {

					// System.out.println(" isSafe( " + i + ", " + j +
					// ", board) "
					// + isSafe(i, j, board));
					if (isSafe(i, j, board)) {
						board[i][j] = true;
						System.out.println(" Queen " + n + "placed at (" + i
								+ "," + j + ")");
						n--;
						break;

					}
				}
			}
		}
	}

	public static boolean solveNQueen(boolean[][] board, int N, int row) {
		if (N == row) {
			return true;
		}

		for (int col = 0; col < board.length; col++) {
			if (isSafe(row, col, board)) {
				board[row][col] = true;
				return solveNQueen(board, N - 1, row + 1);
			}

		}

		return false;

	}

	public static boolean isSafe(int row, int col, boolean[][] board) {
		// if any row has true value in the board
		for (int i = 0; i < board.length; i++) {
			// System.out.println(i + " board[" + row + "][" + i + "] "
			// + board[row][i]);
			if (board[row][i] && i != col) {
				// System.out.println("IN SAME ROW !! NOT SAFE");
				return false;
			}
		}

		for (int i = 0; i < board.length; i++) {
			// System.out.println(i + " board[" + i + "][" + col + "] "
			// + board[i][col]);
			if (board[i][col] && i != row) {
				// System.out.println("IN SAME COL !! NOT SAFE");
				return false;
			}
		}

		// for diagonal
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				if (((i + j) == (row + col) || (((i - j) == (row - col))))) {
					if (board[i][j]) {
						System.out.println("IN DIAGOANL !! NOT SAFE");
						return false;
					}
				}
			}
		}

		return true;

	}

	public static void showBoard(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void showAllDiagonals(int row, int col, boolean[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				if (((i + j) == (row + col) || (((i - j) == (row - col))))) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}
}
