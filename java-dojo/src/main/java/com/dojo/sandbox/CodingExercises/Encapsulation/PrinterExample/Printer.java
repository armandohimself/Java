package com.dojo.sandbox.CodingExercises.Encapsulation.PrinterExample;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel >= 100) tonerAmount = 0;
        if (tonerLevel < 0) tonerLevel = 0;
        else tonerLevel+=tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex == true) {
            pagesPrinted = 0;
            pagesPrinted = (pages/2);
            System.out.println("It's a duplex printer");
        } else {
            pagesPrinted+=pages;
        }
        return pagesPrinted;
    }
}