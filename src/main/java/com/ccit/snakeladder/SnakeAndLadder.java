package com.ccit.snakeladder;

import com.ccit.snakeladder.controller.GameController;
import com.ccit.snakeladder.models.*;

import java.util.*;


public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Enter the number of players");
        Scanner sc = new Scanner(System.in);
        int numberofplayers = sc.nextInt();
       List<Player> pl = new ArrayList<>();
        for (int i = 0; i < numberofplayers; i++) {
            System.out.println("Enter the player name");

            String playername = sc.next();
            System.out.println("Enter the symbol of the player");
            char playersymbol = sc.next().charAt(0);
            Player p = new Player(playername, playersymbol);
            pl.add(p);
        }
        for(int i =0;i< numberofplayers;i++){

            Player p1 = pl.get(i);
            System.out.println(p1.getName());
            System.out.println(p1.getSymbol());
        }

        Map<Integer,Carrier> gm = new HashMap<Integer,Carrier>();
       for(int i =0;i<3;i++){
            System.out.println("Enter the start of the snake"+i);
            int starts = sc.nextInt();
           System.out.println("Enter the end of the snake"+i);
           int ends = sc.nextInt();
           Snake sn =new Snake(starts,ends);
           gm.put(starts,sn);

       }
    //   Map<Integer,Carrier> gm1 = new HashMap<Integer,Carrier>();
       for( int i =0; i<3;i++){
           System.out.println("Enter the start of the ladder"+i);
           int startl = sc.nextInt();
           System.out.println("Enter the end of the ladder");
           int endl = sc.nextInt();
           Ladder ld = new Ladder(startl,endl);
           gm.put(startl,ld);
       }
       GameController GC = new GameController();
        GC.initalize(pl,gm);

       GC.start();
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
       /* List<Player> li = null;
        Map<Integer,Carrier> carruers =null;
        carruers.put(Start,carierobject);
        Game game = new Game(li,c);
*/
    }
}