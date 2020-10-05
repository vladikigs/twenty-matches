package com.vladikigs.entity;

import com.vladikigs.service.PlayerAction;

public class Player {

    private PlayerAction playerAction;
    private String name;

    public Player(String name, PlayerAction playerAction) {
        this.name = name;
        this.playerAction = playerAction;
    }

    public PlayerAction getPlayerAction() {
        return playerAction;
    }

    public String getName() {
        return name;
    }
}
