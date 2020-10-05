package com.vladikigs;


import com.vladikigs.service.GameLogic;
import com.vladikigs.ui.ConsoleUserInterface;

public class Main {

    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic(new ConsoleUserInterface());
    }
}
