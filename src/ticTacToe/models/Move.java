package ticTacToe.models;

public class Move {
    Player player;
    Cell cell;

    public Move(int row, int col) {
        this.cell = new Cell(row, col);
    }

    public Move(int row, int col, Player player) {
        this.cell = new Cell(row, col);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
