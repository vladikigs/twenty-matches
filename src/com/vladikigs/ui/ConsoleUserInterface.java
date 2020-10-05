package com.vladikigs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {

    public ConsoleUserInterface() {
    }

    @Override
    public void showMessageStartGame() {
        System.out.println("Игра начинается!");
    }

    @Override
    public void showMessageEndGame() {
        System.out.println("Игра окончена.");
    }

    @Override
    public void showCountMatches(int matches) {
        System.out.println("Осталось спичек: " + matches);
    }


    @Override
    public void showWinner(String userName) {
        System.out.println("Победил " + userName);
    }

    @Override
    public void showErrorEnteringTheNumberOfMatches() {
        System.out.println("Разрешено забирать от еденицы до трёх спичек. Использовать символы также не допускается.");
    }

    @Override
    public void showUserNameCurrentMove(String name) {
        System.out.println("Ходит " + name);
    }

    @Override
    public int enterUserCountMatches() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число спичек: ");
        try {
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Введите число от еденицы до трёх");
            return enterUserCountMatches();
        }
    }

    @Override
    public void showHowManyMatchesThePlayerTook(String userName, int countMatches) {
        System.out.println("- " + userName + " забрал " + countMatches + " спички(-ку)");

    }
}
