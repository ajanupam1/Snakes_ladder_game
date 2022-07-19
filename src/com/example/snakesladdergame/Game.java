package com.example.snakesladdergame;

import java.util.List;

public class Game {
    Dice dice ;
    List<Players> players ;
    Board board ;

    Game(List<Players>players,Dice dice,Board board){
        this.players = players ;
        this.dice = dice ;
        this.board = board ;
    }
    void startGame(){
        int n = players.size();
        int i =0 ;
        while(i<n){
            int val = dice.RollDice();
            int curr = players.get(i).getPosition();
            int tar = curr+val ;
            if(tar>100){
                tar = curr ;
            }
            if(tar==100) {
                System.out.println(players.get(i).getName() + " is Winner");
                break;
            }
            if(board.hasEntity(tar)){

                tar = board.finalpt(tar) ;
            }
            players.get(i).setPosition(tar) ;
            System.out.println(players.get(i).getName()+" rolled " + val + " and moved to " + players.get(i).getPosition());
            i++ ;
            i = i%n ;
        }
    }

}
