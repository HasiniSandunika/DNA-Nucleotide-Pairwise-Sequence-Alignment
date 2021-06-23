package com.hasini.app.console;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class GlobalAlignment {

    private int[][] direction;
    private double[][] matrix;

    protected void initialize_global_matrix(int seq1, int seq2) {
        matrix = new double[seq1 + 1][seq2 + 1];
        int val = 0;
        for (int j = 0; j < seq2 + 1; j++) {
            matrix[0][j] = val;
            val = val - 1;
        }
        val = 0;
        for (int i = 0; i < seq1 + 1; i++) {
            matrix[i][0] = val;
            val = val - 1;
        }
    }

    protected void initialize_global_direction(int seq1, int seq2) {
        direction = new int[seq1 + 1][seq2 + 1];
        for (int x = 0; x < seq1 + 1; x++) {
            for (int y = 0; y < seq2 + 1; y++) {
                direction[x][y] = 0;
            }
        }
    }

    protected void algorithm_global_matrix(char[] seq1, char[] seq2, double match, double miss_match, double penalty) {
        initialize_global_matrix(seq1.length, seq2.length);
        initialize_global_direction(seq1.length, seq2.length);
        double diagonal, left, top;
        for (int i = 1; i < seq1.length + 1; i++) {
            for (int j = 1; j < seq2.length + 1; j++) {
                if (seq1[i - 1] == seq2[j - 1])
                    diagonal = matrix[i - 1][j - 1] + match;
                else
                    diagonal = matrix[i - 1][j - 1] + miss_match;
                left = matrix[i][j - 1] + penalty;
                top = matrix[i - 1][j] + penalty;
                matrix[i][j] = max_global_cell(diagonal, left, top);
                if (matrix[i][j] == diagonal)
                    direction[i][j] = 1;
                else if (matrix[i][j] == left)
                    direction[i][j] = 2;
                else
                    direction[i][j] = 3;
            }
        }
    }

    protected void print_global_matrix(char[] seq1, char[] seq2) {
        System.out.println();
        System.out.println("Note : rows represent the first sequence and columns represent the second sequence");
        System.out.print("Sequence one : ");
        for (char c : seq1) {
            System.out.print(c);
        }
        System.out.println();
        System.out.print("Sequence two : ");
        for (char c : seq2) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println();
        System.out.println("Score matrix of the global alignment :");
        System.out.println();
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("| %f ", doubles[j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    protected void sequence_global(char[] seq1, char[] seq2) {
        List<char[]> sequence = new ArrayList<>();
        int b = 0;
        char top;
        char mid;
        char bottom;
        int row = direction.length-1;
        int col = direction[0].length-1;
        System.out.println();
        System.out.println("Sequence alignment :\n");
        while (direction[row][col] != 0) {
            if (direction[row][col] == 1) {
                top = seq1[row - 1];
                mid = '|';
                bottom = seq2[col - 1];
                row = row - 1;
                col = col - 1;
            } else if (direction[row][col] == 2) {
                top = '_';
                mid = ' ';
                bottom = seq2[col - 1];
                col = col - 1;
            } else {
                top = seq1[row - 1];
                mid = ' ';
                bottom = '_';
                row = row - 1;
            }
            sequence.add(new char[]{top,mid,bottom});
            b = b + 1;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = b - 1; j >= 0; j--) {
                System.out.print(sequence.get(j)[i]);
            }
            System.out.println();
        }
    }

    protected double max_global_cell(double diagonal, double match_row, double match_col) {
        return Math.max(Math.max(diagonal, match_row), match_col);
    }

}
