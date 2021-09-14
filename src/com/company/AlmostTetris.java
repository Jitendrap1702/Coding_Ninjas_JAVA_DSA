package com.company;

public class AlmostTetris {

    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int[] figures = {3};
        AlmostTetris almostTetris = new AlmostTetris();
        int[][] mat = almostTetris.almostTetris(n, m, figures);
        for (int i = 0; i< mat.length; i++){
            for (int j = 0; j< mat[1].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][][] figureDimension = {{{0, 0}}, {{0, 0}, {0, 1}, {0, 2}}, {{0, 0}, {0, 1}, {1, 0},
            {1, 1}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}}, {{0, 1}, {1, 0}, {1, 1}, {1, 2}}};

    public int[][] almostTetris(int n, int m, int[] figures) {
        int[][] matrix = new int[n][m];
        int code = 1;
        for (int figure : figures) {
            boolean figurePlaced = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (isPossibleAtThisPoint(matrix, figureDimension[figure - 1], i, j, code)) {
                        figurePlaced = true;
                        code++;
                        break;
                    }
                }
                if (figurePlaced) {
                    break;
                }
            }
        }
        return matrix;
    }

    private boolean isPossibleAtThisPoint(int[][] matrix, int[][] fd, int x, int y, int code) {
        for (int i = 0; i < fd.length; i++) {
            int next_x = fd[i][0] + x;
            int next_y = fd[i][1] + y;
            if (next_x >= 0 && next_x < matrix.length && next_y >= 0 && next_y < matrix[0].length) {
                if (matrix[next_x][next_y] != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        for (int i = 0; i < fd.length; i++) {
            int next_x = fd[i][0] + x;
            int next_y = fd[i][1] + y;
            matrix[next_x][next_y] = code;
        }
        return true;
    }
}
