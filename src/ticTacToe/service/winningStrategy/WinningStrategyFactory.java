package ticTacToe.service.winningStrategy;

public class WinningStrategyFactory {
    public WinningStrategy getWinningStrategy(WinningStrategies winningStrategy, int dimension){
        //TODO : add a switch case basis of the strategy chosen and return the object
        return new OrderOneWinningStrategy(dimension);
    }
}
