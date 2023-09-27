package ticTacToe.service.winningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{

    private int dimension;
    private List<HashMap<Character, Integer>> rowHashMaps;
    private List<HashMap<Character, Integer>> colHashMaps;
    private HashMap<Character, Integer> topLeftHashMap;
    private HashMap<Character, Integer> topRightHashMap;
    private HashMap<Character, Integer> cornerHashMap;

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        rowHashMaps = new ArrayList<>();
        colHashMaps = new ArrayList<>();
        topLeftHashMap = new HashMap<>();
        topRightHashMap = new HashMap<>();
        cornerHashMap = new HashMap<>();
        for(int i=0;i<dimension;i++){
            rowHashMaps.add(new HashMap<>());
            colHashMaps.add(new HashMap<>());
        }
    }

    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player player = lastMove.getPlayer();
        char symbol = player.getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();

        if(checkRowWin(row, symbol))
            return player;
        else if(checkColumnWin(col, symbol))
            return player;
        else if(isTopLeftDiagonalCell(row, col) && checkTopLeftDiagonalWin(symbol))
            return player;
        else if(isTopRightDiagonalCell(row, col) && checkTopRightDiagonalWin(symbol))
            return player;
        else if(isCornerCell(row, col) &&  checkCornerWin(symbol))
            return player;
        return null;
    }

    private boolean isTopLeftDiagonalCell(int row, int col){
        return row==col;
    }

    private boolean isTopRightDiagonalCell(int row, int col){
        return (row+col) == (dimension-1);
    }

    private boolean isCornerCell(int row, int col){
        // [0,0]  [0,dimen-1], [dimen-1,0], [dimen-1, dimen-1]
        if(row == 0 || row == dimension-1)
            return col==0 || col==dimension-1;
        return false;
    }

    private boolean checkRowWin(int row, char symbol){
        // if the symbol is not existing, insert in map
        rowHashMaps.get(row).putIfAbsent(symbol, 0);
        //for every insertion of symbol update the count
        rowHashMaps.get(row).put(
                symbol,
                rowHashMaps.get(row).get(symbol) + 1
        );
        return rowHashMaps.get(row).get(symbol) == dimension;
    }

    private boolean checkColumnWin(int col, char symbol){
        // if the symbol is not existing, insert in map
        colHashMaps.get(col).putIfAbsent(symbol, 0);
        //for every insertion of symbol update the count
        colHashMaps.get(col).put(
                symbol,
                colHashMaps.get(col).get(symbol) + 1
        );
        return colHashMaps.get(col).get(symbol) == dimension;
    }

    private boolean checkTopRightDiagonalWin(char symbol){
        // if the symbol is not existing, insert in map
        topRightHashMap.putIfAbsent(symbol, 0);
        //for every insertion of symbol update the count
        topRightHashMap.put(
                symbol,
                topRightHashMap.get(symbol) + 1
        );
        return topRightHashMap.get(symbol) == dimension;
    }

    private boolean checkTopLeftDiagonalWin(char symbol){
        // if the symbol is not existing, insert in map
        topLeftHashMap.putIfAbsent(symbol, 0);
        //for every insertion of symbol update the count
        topLeftHashMap.put(
                symbol,
                topLeftHashMap.get(symbol) + 1
        );
        return topLeftHashMap.get(symbol) == dimension;
    }

    private boolean checkCornerWin(char symbol){
        // if the symbol is not existing, insert in map
        cornerHashMap.putIfAbsent(symbol, 0);
        //for every insertion of symbol update the count
        cornerHashMap.put(
                symbol,
                cornerHashMap.get(symbol) + 1
        );
        return cornerHashMap.get(symbol) == 4;
    }

}

/*
            && -> true && true -> true
                  false&& ____ -> false
                  isTopLeftDiagonalCell(row, col) && checkTopLeftDiagonalWin(row, col, symbol)
                  false                              ___________

           || -> true || ____ -> true

           funA() || funB()
           true   || _____
 */