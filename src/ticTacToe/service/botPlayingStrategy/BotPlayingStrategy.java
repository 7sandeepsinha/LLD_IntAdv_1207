package ticTacToe.service.botPlayingStrategy;

import ticTacToe.exception.GameOverException;
import ticTacToe.models.Board;
import ticTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board) throws GameOverException;
}
