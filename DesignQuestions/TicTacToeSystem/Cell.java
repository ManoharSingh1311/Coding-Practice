package DesignQuestions.TicTacToeSystem;

class Cell {
    private char value; // 'X', 'O', or '-'

    public Cell() {
        this.value = '-';
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == '-';
    }
}