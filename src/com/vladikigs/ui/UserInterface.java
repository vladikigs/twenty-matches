package com.vladikigs.ui;

public interface UserInterface {

    void showMessageStartGame();

    void showMessageEndGame();

    void showCountMatches(int matches);

    void showWinner(String userName);

    void showErrorEnteringTheNumberOfMatches();

    void showUserNameCurrentMove(String name);

    int enterUserCountMatches();

    void showHowManyMatchesThePlayerTook(String userName, int countMatches);
}

