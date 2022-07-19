package com.example.snakesladdergame;

public class Players {
    private String name ;
    private int playerid ;
    private int position ;
    Players(String name,int playerid , int position){
        this.name = name ;
        this.playerid = playerid ;
        this.position = position ;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }
}
