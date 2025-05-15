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
        printi("\ireturns boolean value of double% chance.\n");
        printi("\iUsed as a short cut.\n\n");

        printi("println(...);\n");
        printi("Call: Printer.println();\n");
        printi("\iWill print the same output as 'System.out.println()' would.\n");
        printi("\iUsed as a short cut.\n\n");

        printi("printi(...);\n");
        printi("Call: Printer.printi();\n");
        printi("\iWill print the same output as 'System.out.print()' but with\n");
        printi("\ian added '\t' at the begining for indenting text.\n\n");

        printi("printf(String, ...);\n");
        printi("Call: Printer.printf();\n");
        printi("\iWill print a formated string and working univeraly.\n");

        printi("getInfo();\n");
        printi("Call: Printer.getInfo();\n");
        printi("\iWill print a decription of the Printer class and method definitions.\n");

        println("____________________________________________________________________");
    }
}

/*
____________________________________________________________________
--Printer Class--
    Custom short cuts for print related outputs
____________________________________________________________________
Methods:
    print(...);
    Call: Printer.print();
        Will print the same output as 'System.out.print()' would.
        Used as a short cut.
        
    println(...);
    Call: Printer.println();
        Will print the same output as 'System.out.println()' would.
        Used as a short cut.
        
    printi(...);
    Call: Printer.printi();
        Will print the same output as 'System.out.print()' but with
        an added '\t' at the begining for indenting text.

    printf(String, ...);
    Call: Printer.printf();
        Will print a formated string and working univeraly.

    getInfo();
    Call: Printer.getInfo();
        will print a decription of the Printer class and method definitions.
____________________________________________________________________
*/     
}
