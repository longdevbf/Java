package sudoku;
public class BoardPrinter {
    public static void printBoard(int[][] board) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
