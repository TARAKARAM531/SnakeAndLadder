package com.ccit.snakeladder;

import com.ccit.snakeladder.models.Carrier;
import com.ccit.snakeladder.models.Dice;
import com.ccit.snakeladder.models.Game;
import com.ccit.snakeladder.models.Player;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Enter the number of players");
        Scanner sc = new Scanner(System.in);
        int numberofplayers = sc.nextInt();
        System.out.println("Enter the player name");
        String playername = sc.next();
        System.out.println("Enter the symbol of the player");
        String playersymbol = sc.next().charAt(0);
        Player p = new Player(playername,playersymbol);
        Dice d = new Dice();
        int a = d.Dicegenerator();
        System.out.println("The dice roll value is "+a);

        /*loop till the number of players
          get details of player class
          create player objects

        */

        /*
            get the input from user to have 3 snakes and 3 ladders
             get all mandator snake details
             create snake objects
             get all ladder details
             create ladder objects

         */

        /*
             to create game object
             mandatrory argu are list of players and map object
             create Game object
         */
        List<Player> li = null;
        Map<Integer,Carrier> carruers =null;
        carruers.put(Start,carierobject);
        Game game = new Game(li,c);

    }
}