package sudoku;

public class SudokuValidator {
    private static final int SIZE = 9;

    // Kiểm tra xem số có hợp lệ tại vị trí (row, col)
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // Kiểm tra hàng
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Kiểm tra cột
        for (int x = 0; x < SIZE; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Kiểm tra ô 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
