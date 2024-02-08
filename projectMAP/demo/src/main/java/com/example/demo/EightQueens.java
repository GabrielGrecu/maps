package com.example.demo;

public class EightQueens {
    final int N = 8;
    int[][] board = new int[N][N];

    // Metoda pentru a verifica dacă o regină poate fi plasată în poziția x
    boolean isSafe(int row, int col) {
        int i, j;

        // Verifică rândul pe partea stângă
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Verifică partea superioară a diagonalei stânga
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;


        return true;
    }

    public static void main(String[] args) {
        EightQueens queen = new EightQueens();

    }
}
