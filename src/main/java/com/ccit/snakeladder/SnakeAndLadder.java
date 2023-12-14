package com.ccit.snakeladder;

import com.ccit.snakeladder.models.Carrier;
import com.ccit.snakeladder.models.Dice;
import com.ccit.snakeladder.models.Player;

import java.util.Scanner;


public class SnakeAndLadder {
    public static void main(String[] args) {
       // Player p = new Player("tarak",'t');
       // Player p1 = new Player("vinit",'v');
       // Carrier C = new Carrier(5,15,"ladder");
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice();
        int a = d.Dicegenerator();
        System.out.println("The dice roll value is "+a);
    }
}