package DesignQuestions.TicTacToeSystem;

class Board {
    private int size;
    private Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            return false; // invalid index
        }

        if (!grid[row][col].isEmpty()) {
            return false; // already filled
        }

        grid[row][col].setValue(symbol);
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j].getValue() + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public char getCell(int row, int col) {
        return grid[row][col].getValue();
    }
}