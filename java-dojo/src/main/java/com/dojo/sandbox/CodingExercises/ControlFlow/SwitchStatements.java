// Practicing switch statements from memory

package com.armando.sandbox.CodingExercises.ControlFlow;

class SwitchStatements {
    public boolean throughNormalSwitch(String myName) {
        switch(myName) {
            case "Mando" : {
                return true;
            }
            case "Armando" : {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean throughAdvancedSwitch(String myName) {
        return switch(myName) {
            case "Mando", "Armando" -> {
                yield true;
            }
            default -> {
                yield false;
            }
        };
    }

    public static void main(String[] args) {
        SwitchStatements isMyName = new SwitchStatements();

        System.out.println(isMyName.throughNormalSwitch("Terry"));
        System.out.println(isMyName.throughAdvancedSwitch("Bob"));
        System.out.println(isMyName.throughNormalSwitch("Mando"));
        System.out.println(isMyName.throughAdvancedSwitch("Armando"));
    }
}