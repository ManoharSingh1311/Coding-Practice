package DesignQuestions.TicTacToeSystem;

import java.util.*;

class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private int movesPlayed;

    public Game(Player p1, Player p2, int size) {
        this.players = new Player[]{p1, p2};
        this.board = new Board(size);
        this.currentPlayerIndex = 0;
        this.movesPlayed = 0;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();
            Player current = players[currentPlayerIndex];

            System.out.println(current.getName() + "'s turn (" + current.getSymbol() + ")");
            System.out.print("Enter row and col: ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            // ✅ Validation
            if (!board.makeMove(row, col, current.getSymbol())) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            movesPlayed++;

            // ✅ Win check
            if (WinChecker.checkWin(board, row, col, current.getSymbol())) {
                board.printBoard();
                System.out.println(current.getName() + " wins!");
                break;
            }

            // ✅ Draw check
            if (movesPlayed == board.getSize() * board.getSize()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // 🔄 Switch turn
            currentPlayerIndex = 1 - currentPlayerIndex;
        }

        sc.close();
    }
}