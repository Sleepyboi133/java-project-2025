import java.util.Random;

public class Chance {
    private static final Random random = new Random();

    // Try chance using a decimal [0.0 - 1.0]
    public static boolean roll(double probability) {
        if (probability < 0.0 || probability > 1.0) {
            throw new IllegalArgumentException("Probability must be between 0.0 and 1.0");
        }
        // If probability is 1.0, always return true (100% chance)
        return random.nextDouble() < probability;
    }

    // Try chance using an int [0 - 100]
    public static boolean roll(int probability) {
        if (probability < 0 || probability > 100) {
            throw new IllegalArgumentException("Probability must be between 0 and 100");
        }
        // If probability is 100, always return true (100% chance)
        if (probability == 100) {
            return true;
        }
        return random.nextInt(100) < probability;
    }

    // Get a random double between [0, 1)
    public static double getRandom() {
        return random.nextDouble();
    }

    // Get a random int between [min, max]
    public static int getRandom(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min cannot be greater than max");
        }
        return random.nextInt((max - min + 1)) + min;
    }

    public static void getInfo()
    {
        println("____________________________________________________________________");
        println("--Chance Class-- \n\t quick aceses probability functions");
        println("____________________________________________________________________");
        
        println("Methods:");
        
        printi("roll(double);\n");
        printi("Call: Chance.roll();\n");
        printii("returns boolean value of 'double' precent chance.\n");
        printii("Used as a short cut.\n\n");

        printi("roll(int);\n");
        printi("Call: Chance.roll();\n");
        printii("returns boolean value of 'int' precent chance.\n");
        printii("Used as a short cut.\n\n");

        printi("getRandom();\n");
        printi("Call: Chance.getRandom();\n");
        printii("returns a double value from [0-1)\n\n");

        printi("getRandom(int min, int max);\n");
        printi("Call: Chance.getRandom(min, max);\n");
        printii("returns a double value from [min-max]\n\n");

        printi("getInfo();\n");
        printi("Call: Printer.getInfo();\n");
        printii("Will print a decription of the Printer class and method definitions.\n");
        
        println("____________________________________________________________________");
    }
}
