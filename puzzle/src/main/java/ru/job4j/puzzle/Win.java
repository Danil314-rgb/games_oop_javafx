package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return isWin(board);
    }

    public static boolean monoHorizontal(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1 && board[i][3] == 1 && board[i][4] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoVertical(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1 && board[3][i] == 1 && board[4][i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWin(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 1 && (monoHorizontal(board) || monoVertical(board)))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
