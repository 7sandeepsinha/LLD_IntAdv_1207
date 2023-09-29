package ticTacToe.service.botPlayingStrategy;

public class BotPlayingStrategyFactory {
    //TODO: Create an ENUM for botPlayingStrategy, use it with switch case here
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
