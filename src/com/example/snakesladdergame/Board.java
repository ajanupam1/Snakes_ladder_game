package com.example.snakesladdergame;

import java.util.HashMap;

public class Board {
    private HashMap<Integer,Entity> entity = new HashMap<>();
    public void addEntity(Entity e){
        entity.put(e.getStartpt(),e);
    }
    public boolean hasEntity(int val){
        if(entity.containsKey(val))return true ;
        return false ;
    }
    public int finalpt(int val){
        return entity.get(val).getEndpt() ;
    }
}
