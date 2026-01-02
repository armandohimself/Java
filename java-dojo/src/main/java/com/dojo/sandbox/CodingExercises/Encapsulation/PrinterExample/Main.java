package com.dojo.sandbox.CodingExercises.Encapsulation.PrinterExample;

public class Main {
    public static void main(String[] args) {
        Printer brotherD550 = new Printer(100, false);
        Printer brotherD900 = new Printer(100, true);

        System.out.println(String.format("There's %d toner left..", brotherD550.addToner(100)));

        System.out.println(String.format("Printing %d pages..", brotherD550.printPages(100)));
        System.out.println(String.format("Printing %d pages..", brotherD900.printPages(100)));
    }
}