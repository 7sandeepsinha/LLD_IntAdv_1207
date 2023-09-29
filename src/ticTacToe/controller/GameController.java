package ticTacToe.controller;

import ticTacToe.exception.GameOverException;
import ticTacToe.models.*;
import ticTacToe.service.winningStrategy.WinningStrategies;
import ticTacToe.service.winningStrategy.WinningStrategyFactory;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players, WinningStrategies winningStrategy){
        try{
            return Game.builder()
                    .dimension(dimension)
                    .players(players)
                    .winningStrategy(WinningStrategyFactory.getWinningStrategy(winningStrategy, dimension))
                    .build();
        } catch (Exception e){
            System.out.println("ERROR - " + e.getMessage());
            System.out.println("Could not start the game, something went wrong");
        }
        return null;
    }

    public void displayBoard(Game game){
        game.getCurrentBoard().printBoard();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public Player getGameWinner(Game game){
        return game.getWinner();
    }

    public Move executeMove(Game game, Player player) throws GameOverException {
        Move move = player.makeMove(game.getCurrentBoard());
        game.setNumberOfSymbols(game.getNumberOfSymbols() + 1);
        updateGameStatus(game);
        updateGameMoves(game, move);
        updateBoardStates(game);
        return move;
    }

    public Player checkWinner(Game game, Move lastPlayedMove){
        Player player = game.getWinningStrategy().checkWinner(game.getCurrentBoard(), lastPlayedMove);
        if(player != null){
            game.setWinner(player);
            game.setGameStatus(GameStatus.COMPLETED);
            return player;
        }
        return null;
    }

    public Board undoMove(Game game, Move lastMove){
        //TODO : write the undo logic here
        return null;
    }

    public void replayGame(Game game){
        //TODO : write logic for replay
    }

    private void updateGameMoves(Game game, Move move){
        game.getMoves().add(move);
    }

    private void updateBoardStates(Game game){
        game.getBoardStates().add(new Board(game.getCurrentBoard()));
    }

    private void updateGameStatus(Game game){
        int numberOfSymbols = game.getNumberOfSymbols();
        int dimension = game.getCurrentBoard().getSize();
        if(numberOfSymbols == (dimension*dimension)){
            game.setGameStatus(GameStatus.DRAW);
        }
    }

}
