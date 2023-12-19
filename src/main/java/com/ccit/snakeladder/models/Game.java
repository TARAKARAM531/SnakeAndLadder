package com.ccit.snakeladder.models;

import enums.GameStatusType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {
    List<Player> players = new ArrayList<Player>();
    GameStatusType gs = GameStatusType.INPROGRESS;
    final int WINNINGNUMBER = 100;
    Dice di;
    Map<Integer, Carrier> LS;

    int indexOfPlayer = 0;

    public Game(List<Player> players, Map<Integer, Carrier> LS) {
        this.players = players;
        this.LS = LS;
        this.di = new Dice();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatusType getGs() {
        return gs;
    }

    public void setGs(GameStatusType gs) {
        this.gs = gs;
    }

    public int getWINNINGNUMBER() {
        return WINNINGNUMBER;
    }

    public Dice getDi() {
        return di;
    }

    public void setDi(Dice di) {
        this.di = di;
    }

    public Map<Integer, Carrier> getLS() {
        return LS;
    }

    public void setLS(Map<Integer, Carrier> LS) {
        this.LS = LS;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        int idx = this.indexOfPlayer;
        Player currentPlayer = this.players.get(idx);

        System.out.println("Iits "+currentPlayer.getName()+"''s Turn: ");
        System.out.println("'Enter R to roll the dice:; ");
        String choice = sc.next();
        while(choice.toLowerCase().charAt(0) != 'r'){
            System.out.println("'Enter R to roll the dice:; ");
            choice = sc.next();
        }
        int num = this.di.Dicegenerator();

       int curPposition = getMmove(num);
        currentPlayer.setCurrentposition(curPposition);

        displayMmoves(currentPlayer,num,currentPlayer.getCurrentposition());
        this.indexOfPlayer = (this.indexOfPlayer+1)%players.size();

    }

    private void displayMmoves(Player currentPlayer, int num, int currentposition) {
        System.out.println("'Aafter rolled dice:;");
        System.out.println( currentPlayer.getName()+"''s Ddetails");
        System.out.println("'Rrolled number:; "+num);
        System.out.println("'Updated position:;"+   currentPlayer.getCurrentposition());
        System.out.println("'-----------------------------");
    }

    private int getMmove(int num) {

        Player p = this.players.get(this.indexOfPlayer);
        int position = p.getCurrentposition();
        int nextPpositon = position+num;
        if(nextPpositon == WINNINGNUMBER){
            this.setGs(GameStatusType.WIN);
            return nextPpositon;
        }
        if(nextPpositon > WINNINGNUMBER){

            return position;
        }
        Carrier carrier = this.LS.get(nextPpositon);
        if(carrier == null){
            return nextPpositon;
        }else{
            if(carrier.getEnd() > carrier.getStart()){
                System.out.println("'Yyou got LADDER:;");
            }else{
                System.out.println("'YOU Ggot SNALE BITE");
            }
            nextPpositon = carrier.getEnd();
        }
        return nextPpositon;
    }
}
