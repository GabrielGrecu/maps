package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {
    final int N = 8;
    int[][] tabla = new int[N][N];
    List<int[][]> solutions = new ArrayList<>();

    // Metoda pentru a verifica daca o regina poate fi plasata în pozitia x
    boolean check(int row, int col) {
        int i, j;

        // Verifica randul pe partea stanga
        for (i = 0; i < col; i++)
            if (tabla[row][i] == 1)
                return false;


        //aici verificam partea superioara a diagonalei stanga
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (tabla[i][j] == 1)
                return false;


        //aici verificam partea inferioara a diagonalei stanga
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (tabla[i][j] == 1)
                return false;

        return true;

    }


    boolean rezolveQueen(int col) {

        //folosim recursivitatea
        //iar daca toate reginele sunt plasate, returneaza true
        if (col >= N)
            return true;


        //plasam reginele pe fiecare coloana
        for (int i = 0; i < N; i++) {
            if (check(i, col)) {
                tabla[i][col] = 1;


                //plasam reginele recursiv pentru urm coloana
                if (rezolveQueen(col + 1))
                    return true;

                //daca plasarea reginei nu duce la o solutie, atunci inapoiem regina
                tabla[i][col] = 0;
            }
        }
        //iar daca regina nu poate fii plasata in nicio pozitie din acea coloana
        //atunci returnam false
        return false;
    }

    //afisam tabla de sah cu reginele plasate
    void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + tabla[i][j] + " ");
            System.out.println();
        }
    }

    boolean rezolveQueen() {
        if (!rezolveQueen(0)) {
            System.out.println("Nu există soluție");
            return false;
        }

        printSolution();
        return true;
    }


    boolean check(int[][] tabla, int row, int col) {
        int i, j;

        // Verifica randul pe partea stanga
        for (i = 0; i < col; i++)
            if (tabla[row][i] == 1)
                return false;

        //aici verificam partea superioara a diagonalei stanga
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (tabla[i][j] == 1)
                return false;

        //aici verificam partea inferioara a diagonalei stanga
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (tabla[i][j] == 1)
                return false;

        return true;
    }

    void rezolveQueen(int[][] board, int col) {
        // daca reginele sunt plasate, adauga solutia în lista de solutii
        if (col >= N) {
            int[][] solution = new int[N][N];
            for (int i = 0; i < N; i++)
                System.arraycopy(board[i], 0, solution[i], 0, N);
            solutions.add(solution);
            return;
        }

        // plaseaza reginele pe fiecare coloana
        for (int i = 0; i < N; i++) {
            if (check(board, i, col)) {
                board[i][col] = 1;

                // plasam recursiv reginele pentru următoarea coloana
                rezolveQueen(board, col + 1);

                board[i][col] = 0;
            }
        }
    }

    void findNumberOfSolutions() {
        int[][] board = new int[N][N];
        rezolveQueen(board, 0);

        if (solutions.isEmpty()) {
            System.out.println("Nu exista solutie");
        } else {
            System.out.println("Numarul total de solutii: " + solutions.size());
            for (int i = 0; i < solutions.size(); i++) {
                System.out.println("Solutia " + (i + 1) + ":");
                printSolution(solutions.get(i));
                System.out.println();
            }
        }
    }

    void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        EightQueens queen = new EightQueens();
        queen.rezolveQueen();
        System.out.println();
        queen.findNumberOfSolutions();
    }
}
