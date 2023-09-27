package ticTacToe.service.winningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
