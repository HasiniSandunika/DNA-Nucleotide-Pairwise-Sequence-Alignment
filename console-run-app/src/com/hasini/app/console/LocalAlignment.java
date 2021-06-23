package com.hasini.app.console;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class LocalAlignment {
    private int[][] direction;
    private double[][] matrix;

    protected void initialize_local_matrix(int seq1, int seq2) {
        matrix = new double[seq1 + 1][seq2 + 1];
        for (int i = 0; i < seq1 + 1; i++) {
            for (int j = 0; j < seq2 + 1; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    protected void initialize_local_direction(int seq1, int seq2) {
        direction = new int[seq1 + 1][seq2 + 1];
        for (int i = 0; i < seq1 + 1; i++) {
            for (int j = 0; j < seq2 + 1; j++) {
                direction[i][j] = 0;
            }
        }
    }

    protected void algorithm_local_matrix(char[] seq1, char[] seq2, double match, double miss_match, double penalty) {
        initialize_local_matrix(seq1.length, seq2.length);
        initialize_local_direction(seq1.length, seq2.length);
        double diagonal, left, top;
        for (int i = 1; i < seq1.length + 1; i++) {
            for (int j = 1; j < seq2.length + 1; j++) {
                if (seq1[i - 1] == seq2[j - 1])
                    diagonal = matrix[i - 1][j - 1] + match;
                else
                    diagonal = matrix[i - 1][j - 1] + miss_match;
                left = matrix[i][j - 1] + penalty;
                top = matrix[i - 1][j] + penalty;
                if (max_local_cell(diagonal, left, top) < 0)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = max_local_cell(diagonal, left, top);
                if(matrix[i][j] == 0)
                    direction[i][j]=0;
                else if (matrix[i][j] == diagonal)
                    direction[i][j] = 1;
                else if(matrix[i][j] == left)
                    direction[i][j] = 2;
                else
                    direction[i][j] = 3;
            }
        }
    }

    protected void print_local_matrix(char[] seq1, char[] seq2) {
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
        System.out.println("Score matrix of the local alignment :");
        System.out.println();
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("| %f ", doubles[j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    protected void sequence_local(char[] seq1, char[] seq2) {
        if(max_local_matrix()[0]==0)
            System.out.println("Cannot perform local alignment");
        else {
            List<char[]> sequence = new ArrayList<>();
            int b = 0;
            char top;
            char mid;
            char bottom;
            int row = (int) max_local_matrix()[1];
            int col = (int) max_local_matrix()[2];
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
                sequence.add(new char[]{top, mid, bottom});
                b = b + 1;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = b - 1; j >= 0; j--) {
                    System.out.print(sequence.get(j)[i]);
                }
                System.out.println();
            }
        }
    }

    protected double[] max_local_matrix() {
        double[] mat = new double[3];
        double max = Double.MIN_VALUE;
        for (int row = matrix.length-1; row >=0 ; row--) {
            for (int col = matrix[row].length-1; col >=0 ; col--) {
                if (matrix[row][col] > max) {
                    max=matrix[row][col];
                    mat[0] = matrix[row][col];
                    mat[1] =row;
                    mat[2]=col;
                }
            }
        }
        return mat;
    }

    protected double max_local_cell(double diagonal, double left, double top) {
        return Math.max(Math.max(diagonal, left), top);
    }

}
