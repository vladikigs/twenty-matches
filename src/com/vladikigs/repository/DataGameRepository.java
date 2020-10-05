package com.vladikigs.repository;

import com.vladikigs.entity.Game;
import com.vladikigs.entity.Player;

public class DataGameRepository implements GameRepository {

    private Game game = new Game();
    private int playerIndexWhichMakingMove = 0;
    private Player[] players;

    public DataGameRepository() {
    }

    public Player getPlayer() {
        return players[playerIndexWhichMakingMove];
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPlayerIndexWhichMakingMove() {
        return playerIndexWhichMakingMove;
    }

    @Override
    public String getNameUser() {
        return players[playerIndexWhichMakingMove].getName();
    }

    public void setPlayerIndexWhichMakingMove(int playerIndexWhichMakingMove) {
        this.playerIndexWhichMakingMove = playerIndexWhichMakingMove;
    }

    @Override
    public int getCountMatches() {
        return game.getCountMatches();
    }

    @Override
    public void subtractMatches(int count) {
        game.setCountMatches(game.getCountMatches() - count);
    }


}
