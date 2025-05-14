import java.util.Random;

public class Chance {
    private static final Random random = new Random();

    // Try chance using a decimal (0.0 - 1.0)
    public static boolean roll(double probability) {
        if (probability < 0.0 || probability > 1.0) {
            throw new IllegalArgumentException("Probability must be between 0.0 and 1.0");
        }
        return random.nextDouble() < probability;
    }

    // Try chance using an int (0 - 100)
    public static boolean roll(int probability) {
        if (probability < 0 || probability > 100) {
            throw new IllegalArgumentException("Probability must be between 0 and 100");
        }
        return random.nextInt(100) < probability;
    }

    // Get a random double between 0.0 (inclusive) and 1.0 (exclusive)
    public static double getRandom() {
        return random.nextDouble(); // Already returns a value in the range [0, 1)
    }

    // Get a random int between min and max (inclusive)
    public static int getRandom(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min cannot be greater than max");
        }
        return random.nextInt((max - min + 1)) + min;
    }
}
