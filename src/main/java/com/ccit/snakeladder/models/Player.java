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

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setCurrentposition(int currentposition) {
        this.currentposition = currentposition;
    }
}
