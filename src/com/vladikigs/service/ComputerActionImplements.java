package com.vladikigs.service;

import com.vladikigs.repository.DataGameRepository;

public class ComputerActionImplements implements PlayerAction {

    DataGameRepository dataGameRepository;

    public ComputerActionImplements(DataGameRepository dataGameRepository) {
        this.dataGameRepository = dataGameRepository;
    }

    @Override
    public int pickUpTheMatches() {
        int countMatches = dataGameRepository.getCountMatches();

        int necessaryNumber = 0;

        for (int i = 1; i <= countMatches; i += 4) {
            if (countMatches > i) {
                necessaryNumber = i;
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (countMatches - i == necessaryNumber) {
                return i;
            }
        }

        return countMatches % 2 == 0 ? 1 : 2;
    }
}
