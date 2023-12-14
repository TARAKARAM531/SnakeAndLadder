package com.ccit.snakeladder.models;

public class Player {

    private String name;
    private char symbol;
    private int currentposition;

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getCurrentposition() {
        return currentposition;
    }

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;


    }
}
