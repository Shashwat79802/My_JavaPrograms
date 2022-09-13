package com.shashwat.Recursion.Backtracking;

/*
The recurrence relation will be : T(N) = N * T(N-1) + O(N²)

So, the time complexity of the solution will be = T(N) = O(N³ + N!) = O(N!)

and Space complexity is O(N*N) --- because of the 2D array of size N
 */

public class NQueens
{
    public static void main (String[] args) {

        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {

        if (row == board.length) {

            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (placeIsValid(board, row, col)) {

                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean placeIsValid(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (board[i][col]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {

            if (board[row - i][col + i]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {

            if (board[row - i][col - i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {

        for (boolean[] arr : board) {
            for (boolean ele : arr) {

                if (ele) {
                    System.out.print('Q' + " ");
                }else {
                    System.out.print('X' + " ");
                }
            }
            System.out.println();
        }
    }
}
