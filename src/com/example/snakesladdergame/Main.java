package com.example.snakesladdergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String arg[]){
        Board board = new Board() ;
        Dice dice = new Dice() ;
        Scanner scanner = new Scanner(System.in);
        int snakes = scanner.nextInt() ;
        for(int i=0 ; i<snakes ; i++){
            int s = scanner.nextInt() ;
            int e = scanner.nextInt() ;
            Entity snk = new Snake(s,e);
            board.addEntity(snk);
        }
        int ladders = scanner.nextInt();
        for(int i=0 ; i<ladders ; i++){
            int s = scanner.nextInt() ;
            int e = scanner.nextInt() ;
            Entity ladd = new Ladder(s,e);
            board.addEntity(ladd);
        }
        List<Players> pl = new ArrayList<>();
        int players = scanner.nextInt();
        for(int i=0 ; i<players ; i++){
            String name = scanner.next() ;
            Players players1 = new Players(name,i,0) ;
            pl.add(players1) ;
        }
       Game newgame = new Game(pl,dice,board) ;

        newgame.startGame();
    }
}
