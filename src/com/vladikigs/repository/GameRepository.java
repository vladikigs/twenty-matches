package com.vladikigs.repository;

public interface GameRepository {

    void subtractMatches(int count);

    String getNameUser();

    int getCountMatches();
}
