package sudoku;
import sudoku.SudokuValidator;
public class SudokuSolver {
    private static final int SIZE = 9;

    // Hàm giải Sudoku
    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Tìm ô trống (ô có giá trị 0)
                if (board[row][col] == 0) {
                    // Thử tất cả các số từ 1 đến 9
                    for (int num = 1; num <= SIZE; num++) {
                        if (SudokuValidator.isValid(board, row, col, num)) {
                            board[row][col] = num;

                            // Tiếp tục giải
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Nếu không giải được, quay lui
                            board[row][col] = 0;
                        }
                    }
                    return false; // Không có số hợp lệ, không thể giải
                }
            }
        }
        return true; // Bảng đã được giải
    }
}
