package com.company.DSA.OOPS4.TicTacToeGame;

import java.util.Scanner;

public class TicTacToe {

    private Player player1, player2;
    private Board board;

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        // take player input
        player1 = takePlayerInput(1);
        player2 = takePlayerInput(2);
        while (player1.getSymbol() == player2.getSymbol()){
            System.out.println("symbol already taken!! please enter symbol again.");
            player2.setSymbol(sc.next().charAt(0));
        }
        // create board
        board = new Board(player1.getSymbol(), player2.getSymbol());

        // play game
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while (status == Board.INCOMPLETE || status == Board.INVALIDMOVE){

            if (player1Turn){
                System.out.println("Player1 --> " + player1.getName() + "'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                /* 1. player1 win
                    2. player2 win
                    3. Draw
                    4. Incomplete
                    5. Invalid
                 */
                status = board.move(player1.getSymbol(), x, y);
                if (status == Board.INVALIDMOVE){
                    System.out.println("Invalid Move!! please enter coordinate again");
                }else {
                    player1Turn = false;
                    board.print();
                }

            }else {
                System.out.println("Player2 --> " + player2.getName() + "'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();

                status = board.move(player2.getSymbol(), x, y);
                if (status == Board.INVALIDMOVE){
                    System.out.println("Invalid Move!! please enter coordinate again");
                }else {
                    player1Turn = true;
                    board.print();
                }
            }
        }

        if (status == Board.PLAYER1WINS){
            System.out.println("Player1 --> " + player1.getName() + " wins!!");
        }else if (status == Board.PLAYER2WINS){
            System.out.println("Player2 --> " + player2.getName() + " wins!!");
        }else {
            System.out.println("Draw!!");
        }
    }

    public Player takePlayerInput(int num){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player" + num + " name : ");
        String name = sc.nextLine();
        System.out.println("Enter Player" + num + " symbol : ");
        char symbol = sc.next().charAt(0);
        Player p = new Player(name, symbol);
        return p;
    }
}
