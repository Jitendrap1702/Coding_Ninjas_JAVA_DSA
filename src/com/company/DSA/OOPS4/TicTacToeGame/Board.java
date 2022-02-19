package com.company.DSA.OOPS4.TicTacToeGame;

public class Board {

    private char[][] board;
    private int boardSize = 3;
    private char p1Symbol, p2Symbol;
    // count of number of cells that are filled.
    private int count;
    public static final char EMPTY = ' ';
    public static final int PLAYER1WINS = 1;
    public static final int PLAYER2WINS = 2;
    public static final int DRAW = 3;
    public static final int INCOMPLETE = 4;
    public static final int INVALIDMOVE = 5;

    public Board(char p1Symbol, char p2Symbol) {

        board = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = ' ';
            }
        }
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }

    public void print() {

        System.out.println("-------------------");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public int move(char symbol, int x, int y) {

        if (x >= boardSize || x < 0 || y >= boardSize || y < 0 || board[x][y] != EMPTY) {
            return Board.INVALIDMOVE;
        }

        board[x][y] = symbol;
        count++;
        return checkWinner(x, y, symbol);
    }

    private int checkWinner(int x, int y, char symbol) {

        // check in row
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
            return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
        }

        // check in column
        if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
            return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
        }

        // check in diagonal
        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
        }

        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return symbol == p1Symbol ? PLAYER1WINS : PLAYER2WINS;
        }

        // check draw or incomplete
        if (count == boardSize * boardSize) {
            return Board.DRAW;
        } else {
            return Board.INCOMPLETE;
        }
    }
}
