package ticTacToe.exception;

public class DuplicateSymbolException extends Exception{
    public DuplicateSymbolException() {
    }

    public DuplicateSymbolException(String message) {
        super(message);
    }
}
