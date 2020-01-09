package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rezult = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 'X') {
                rezult = false;
                break;
            }
        }
        return rezult;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean rezult = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                rezult = false;
                break;
            }
        }
        return rezult;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] array = extractDiagonal(board);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
