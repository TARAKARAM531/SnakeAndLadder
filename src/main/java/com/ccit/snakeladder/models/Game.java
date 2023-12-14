package com.ccit.snakeladder.models;

import enums.GameStatusType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {
    List<Player> players = new ArrayList<Player>();
    GameStatusType gs = GameStatusType.INPROGRESS;
    final int WINNINGNUMBER = 100;
    Dice di;
    Map<int,Carrier> LS;

    public Game(List<Player> players, Map<int, Carrier> LS) {
        this.players = players;
        this.LS = LS;
    }
}
