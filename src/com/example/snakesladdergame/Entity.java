package com.example.snakesladdergame;

public abstract class Entity {
    private int startpt ;
    private int endpt ;
    Entity(int startpt , int endpt){
        this.startpt = startpt ;
        this.endpt = endpt ;
    }
    public abstract int getId() ;

    public int getStartpt() {
        return startpt;
    }

    public int getEndpt() {
        return endpt;
    }
}
