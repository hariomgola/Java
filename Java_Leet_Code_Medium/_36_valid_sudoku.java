package Java_Leet_Code_Medium;

import java.util.HashSet;

/**
 * Completed and Accepted
 */
public class _36_valid_sudoku {

	public static void main(String[] args) {
		_36_valid_sudoku cs = new _36_valid_sudoku();
		cs.isValidSudoku(new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } });
		cs.isValidSudoku(new char[][] { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } });
		cs.isValidSudoku(new char[][] { { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
				{ '.', '4', '.', '3', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
				{ '8', '.', '.', '.', '.', '.', '.', '2', '.' }, { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
				{ '.', '1', '5', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '2', '.', '9', '.', '.', '.', '.', '.' }, { '.', '.', '4', '.', '.', '.', '.', '.', '.' } });
	}

	// With less Memory
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> _hs = new HashSet<Character>();
		boolean value = true;

		outer: for (int i = 0; i < board.length; i++) {
			// Vertical check
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.' && !_hs.add(board[i][j])) {
					value = false;
					break outer;
				}
			}
			// horizontal check
			_hs.clear();
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] != '.' && !_hs.add(board[j][i])) {
					value = false;
					break outer;
				}
			}
			_hs.clear();
			// inner check
			if (i == 0 || i == 3 || i == 6) {
				for (int j = 0; j < board.length; j++) {
					for (int k = 0; k < 3; k++) {
						if (board[j][i + k] != '.' && !_hs.add(board[j][i + k])) {
							value = false;
							break outer;
						}
					}
					if (j == 2 || j == 5 || j == 8) {
						_hs.clear();
					}
				}
			}

		}
		return value;
	}

	// With more memory
	public boolean _isValidSudoku(char[][] board) {
		boolean value = true;
		outer: for (int i = 0; i < board.length; i++) {
			HashSet<Character> _rhs = new HashSet<Character>();
			HashSet<Character> _chs = new HashSet<Character>();
			HashSet<Character> _ihs = new HashSet<Character>();
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.' && !_rhs.add(board[i][j])) {
					value = false;
					break outer;
				}
				if (board[j][i] != '.' && !_chs.add(board[j][i])) {
					value = false;
					break outer;
				}
				if (i == 0 || i == 3 || i == 6) {
					for (int k = 0; k < 3; k++) {
						if (board[j][i + k] != '.' && !_ihs.add(board[j][i + k])) {
							value = false;
							break outer;
						}
					}
					if (j == 2 || j == 5 || j == 8) {
						_ihs.clear();
					}
				}
			}
		}
		return value;
	}

}
