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
}
