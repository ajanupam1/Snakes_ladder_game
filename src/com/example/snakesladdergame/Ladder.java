package com.example.snakesladdergame;

public class Ladder extends Entity{
    Ladder(int startpt, int endpt) {
        super(startpt, endpt);
    }

    @Override
    public int getId() {
        return 1;
    }
}
