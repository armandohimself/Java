// Practicing switch statements from memory

package CodingExercises;

class SwitchStatements {
    public boolean normalSwitch(String myName) {
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

    public boolean advanceSwitch(String myName) {
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

        System.out.println(isMyName.normalSwitch("Terry"));
        System.out.println(isMyName.advanceSwitch("Bob"));
        System.out.println(isMyName.normalSwitch("Mando"));
        System.out.println(isMyName.advanceSwitch("Armando"));
    }
}