public class Printer {

    //print
    public static void print(Object... args)
    {
        StringBuilder result = new StringBuilder();
        for (Object arg : args)
        {
            result.append(arg);  // Convert each argument to string
        }
        System.out.print(result.toString());
    }

    //println
    public static void println(Object... args)
    {
        StringBuilder result = new StringBuilder();
        for (Object arg : args)
        {
            result.append(arg);  // Convert each argument to string
        }
        System.out.println(result.toString());
    }

    //print indent
    public static void printi(Object... args)
    {
        StringBuilder result = new StringBuilder();
        for (Object arg : args)
        {
            result.append(arg);  // Convert each argument to string
        }
        print("\t" + result.toString());
    }

    //printf                          P.S. : WHYYY IS IT SO EASY
    public static void printf(String format, Object... args) {
        print(String.format(format, args));
    }

    public static void getInfo()
    {
        println("____________________________________________________________________");
        println("--Printer Class-- \n\t Custom short cuts for print related outputs.");
        println("____________________________________________________________________");
        
        println("Methods:");
        
        printi("print(...);\n");
        printi("Call: Printer.print();\n");
        printi("\iWill print the same output as 'System.out.print()' would.\n");
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
