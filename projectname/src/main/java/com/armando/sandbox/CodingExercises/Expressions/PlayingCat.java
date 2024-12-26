package com.armando.sandbox.CodingExercises.Expressions;

public class PlayingCat {
    
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temp) {
    boolean isCatPlaying = false;
    
    // if summer
    if (summer) {
        // if temp inclusive 25-45
        if (temp >= 25 && temp <= 45) {
            // cats playing
            isCatPlaying = true;
        }
    } 
    // otherise 
    else {
        // if temp inclusive 25-35
        if (temp >= 25 && temp <= 35) {
            // cat plays
            isCatPlaying = true;
        } else {
            isCatPlaying = false;
        }
        }
    
    return isCatPlaying;
    //EO method
    }
}