package com.company.DSA.OOPS4.TicTacToeGame;

public class TicTacToe {

    private Player player1, player2;
    private Board board;

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        // take player input
        player1 = new Player("Gautam", 'x');
        player2 = new Player("Yuvraj", '0');
        // create board
        board = new Board(player1.getSymbol(), player2.getSymbol());
        // play game

//        while (checkWinner(board) == ' '){
//
//        }

    }

    public static char checkWinner(int[][] board){

        // check in rows
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                row.append(board[i][j]);
            }

            if (row.equals("xxx")){
                return 'x';
            }
            if (row.equals("000")){
                return '0';
            }
        }

        // check in columns
        StringBuilder column = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                column.append(board[j][i]);
            }

            if (column.equals("xxx")){
                return 'x';
            }
            if (column.equals("000")){
                return '0';
            }
        }

        // check in diagonal
        String d1 = String.valueOf(board[0][0] + board[1][1] + board[2][2]);
        if (d1.equals("xxx")){
            return 'x';
        }
        if (d1.equals("000")){
            return '0';
        }

        String d2 = String.valueOf(board[0][2] + board[1][1] + board[2][0]);
        if (d2.equals("xxx")){
            return 'x';
        }
        if (d2.equals("000")){
            return '0';
        }

        return ' ';
    }
}
