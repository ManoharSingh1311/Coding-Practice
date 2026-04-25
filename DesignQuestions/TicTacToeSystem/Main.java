package DesignQuestions.TicTacToeSystem;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Neeraj", 'X');
        Player p2 = new Player("Opponent", 'O');

        Game game = new Game(p1, p2, 3);
        game.start();
    }
}