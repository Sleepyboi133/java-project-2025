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

    //printf                          P.S. : WHYYY IS IT SO EASY
    public static void printf(String format, Object... args) {
        System.out.print(String.format(format, args));
    }
}
