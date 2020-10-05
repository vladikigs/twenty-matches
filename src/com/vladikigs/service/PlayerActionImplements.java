package com.vladikigs.service;

import com.vladikigs.ui.UserInterface;

public class PlayerActionImplements implements PlayerAction {

    private UserInterface userInterface;

    public PlayerActionImplements(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public int pickUpTheMatches() {
        int userCountMatches;
        userCountMatches = userInterface.enterUserCountMatches();

        if (userCountMatches >= 1 && userCountMatches <= 3) {
            return userCountMatches;
        } else {
            userInterface.showErrorEnteringTheNumberOfMatches();
            return pickUpTheMatches();
        }
    }
}


