package com.vladikigs.service;

import com.vladikigs.entity.Player;
import com.vladikigs.repository.DataGameRepository;
import com.vladikigs.ui.UserInterface;

public class GameLogic {

    private UserInterface userInterface;
    private DataGameRepository gameRepository;

    public GameLogic(UserInterface userInterface) {

        this.userInterface = userInterface;
        this.gameRepository = new DataGameRepository();

        Player[] players = new Player[]
                {
                        new Player("Компьютер", new ComputerActionImplements(this.gameRepository)),
                        new Player("Игрок", new PlayerActionImplements(this.userInterface))
                };
        this.gameRepository.setPlayers(players);
        userInterface.showMessageStartGame();

        nextStepGame(gameRepository.getPlayer().getPlayerAction());
    }

    private void nextStepGame(PlayerAction playerAction) {
        if (gameRepository.getCountMatches() <= 1) {
            userInterface.showMessageEndGame();
            passMoveToAnotherPlayer();
            userInterface.showWinner(gameRepository.getNameUser());
        } else {

            userInterface.showUserNameCurrentMove(gameRepository.getNameUser());

            int numberOfMatchesTaken = playerAction.pickUpTheMatches();
            gameRepository.subtractMatches(numberOfMatchesTaken);
            userInterface.showHowManyMatchesThePlayerTook(gameRepository.getNameUser(), numberOfMatchesTaken);

            userInterface.showCountMatches(gameRepository.getCountMatches());
            passMoveToAnotherPlayer();
            nextStepGame(gameRepository.getPlayer().getPlayerAction());
        }
    }

    private void passMoveToAnotherPlayer() {
        if (gameRepository.getPlayerIndexWhichMakingMove() == 0) {
            gameRepository.setPlayerIndexWhichMakingMove(1);
        } else {
            gameRepository.setPlayerIndexWhichMakingMove(0);
        }
    }
}
