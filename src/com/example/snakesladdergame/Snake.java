package com.example.snakesladdergame;

public class Snake extends Entity{
   Snake(int startpt , int endpt){
       super(startpt,endpt) ;
   }
   @Override
    public int getId(){
       return 0 ;
   }
}
