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

        // Verifica partea superioara a diagonalei stanga
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;


        return true;
    }

    public static void main(String[] args) {
        EightQueens queen = new EightQueens();

    }
}
