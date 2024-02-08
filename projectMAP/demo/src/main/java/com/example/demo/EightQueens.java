package com.example.demo;

public class EightQueens {
    final int N = 8;
    int[][] board = new int[N][N];

    // Metoda pentru a verifica daca o regina poate fi plasata în pozitia x
    boolean isSafe(int row, int col) {
        int i, j;

        // Verifica randul pe partea stanga
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;


        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;


        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;

    }


    boolean solveNQUtil(int col) {

        if (col >= N)
            return true;


        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;


                if (solveNQUtil(col + 1))
                    return true;

                board[i][col] = 0;
            }
        }
        return false;
    }

    void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        EightQueens queen = new EightQueens();

    }
}
