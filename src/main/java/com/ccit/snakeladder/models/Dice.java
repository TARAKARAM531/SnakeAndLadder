package com.ccit.snakeladder.models;
import java.util.Random;
import java.util.random.RandomGenerator;
public class Dice {
    public int Dicegenerator(){
        Random rand = new Random();
        int dicevalue = rand.nextInt(7);
        if(dicevalue == 0)
            return 1;
         else
        return dicevalue;
    }

}
