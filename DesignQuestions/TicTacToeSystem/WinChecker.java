package DesignQuestions.TicTacToeSystem;

class WinChecker {

    public static boolean checkWin(Board board, int row, int col, char symbol) {
        int size = board.getSize();

        boolean winRow = true;
        boolean winCol = true;
        boolean winDiag = true;
        boolean winAntiDiag = true;

        // Check row & column
        for (int i = 0; i < size; i++) {
            if (board.getCell(row, i) != symbol) winRow = false;
            if (board.getCell(i, col) != symbol) winCol = false;
        }

        // Check main diagonal
        if (row == col) {
            for (int i = 0; i < size; i++) {
                if (board.getCell(i, i) != symbol) winDiag = false;
            }
        } else {
            winDiag = false;
        }

        // Check anti-diagonal
        if (row + col == size - 1) {
            for (int i = 0; i < size; i++) {
                if (board.getCell(i, size - i - 1) != symbol) winAntiDiag = false;
            }
        } else {
            winAntiDiag = false;
        }

        return winRow || winCol || winDiag || winAntiDiag;
    }
}