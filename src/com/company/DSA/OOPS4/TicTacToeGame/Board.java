package com.company.DSA.OOPS4.TicTacToeGame;

public class Board {

    private char[][] board;
    private int boardSize = 3;
    private char p1Symbol, p2Symbol;
    // count of number of cells that are filled.
    private int count;

    public Board(char p1Symbol, char p2Symbol){

        board = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++){
            for (int j = 0; j < boardSize; j++){
                board[i][j] = ' ';
            }
        }
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }
}
