package ticTacToe.service.botPlayingStrategy;

import ticTacToe.exception.GameOverException;
import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player) throws GameOverException;
}
