package ticTacToe.exception;

public class GameOverException extends Exception{
    public GameOverException() {
    }

    public GameOverException(String message) {
        super(message);
    }
}
