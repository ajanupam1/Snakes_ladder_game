package com.example.snakesladdergame;

public class Dice {
    int RollDice(){
     int maxval = 6 ;
     int minval = 1 ;
     int roll = (int)Math.floor(Math.random()*(maxval-minval+1)+minval) ;
     return roll ;
    }
}
