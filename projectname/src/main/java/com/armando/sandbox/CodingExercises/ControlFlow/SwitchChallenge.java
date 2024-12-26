package com.armando.sandbox.CodingExercises.ControlFlow;

public class SwitchChallenge {
    char expresssion;

    public static String NatoResponse(char letter) {
        switch(letter) {
            case 'A':
            return "Able";
            case 'B':
            return "Baker";
            case 'C':
            return "Charlie";
            case 'D':
            return "Dog";
            case 'E':
            return "Easy";
            default:
            return letter + " was not found"; 
        }
    }

    public static String EnhancedNatoResponse(char letter) {
        return switch(letter) {
            case 'A' -> { yield "Alpha"; }
            case 'B' -> { yield "Baker"; } 
            case 'C' -> { yield "Charlie"; }
            case 'D' -> { yield "Dog"; }
            case 'E' -> { yield "Easy"; }
            default -> {
                yield letter + " is not valid";
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(NatoResponse('A'));
        System.out.println(NatoResponse('F'));
        System.out.println(EnhancedNatoResponse('F'));
        System.out.println(EnhancedNatoResponse('A'));
    }
}