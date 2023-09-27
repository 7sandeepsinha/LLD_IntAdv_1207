package ticTacToe.service.botPlayingStrategy;

import ticTacToe.exception.GameOverException;
import ticTacToe.models.Board;
import ticTacToe.models.Cell;
import ticTacToe.models.CellState;
import ticTacToe.models.Move;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) throws GameOverException {
        List<List<Cell>> matrix = board.getBoard();
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size();j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return new Move(i,j);
                }
            }
        }
        throw new GameOverException("No new cells to play with, GAME OVER");
    }
}
