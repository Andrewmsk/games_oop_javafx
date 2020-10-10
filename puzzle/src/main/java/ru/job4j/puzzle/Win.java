package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        for (int symbol: board[row]) {
            if (symbol != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int[] row: board) {
            if (row[column] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && monoHorizontal(board, i) || monoVertical(board, i)) {
                return true;
            }
        }
        return false;
    }
}
