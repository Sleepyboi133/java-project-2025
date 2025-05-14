public class ChanceRunner {
    public static void main(String[] args) {
        // Header for the program
        System.out.println("=======================================");
        System.out.println("       Chance Class Method Demo       ");
        System.out.println("=======================================");
        
        // Demonstrating the roll method with decimal probability (0.0 - 1.0)
        System.out.println("\n--- Testing roll(double probability) ---");
        System.out.println("Rolling with 0.5 probability (50% chance): " + Chance.roll(0.5));
        System.out.println("Rolling with 1.0 probability (100% chance): " + Chance.roll(1.0));
        System.out.println("Rolling with 0.0 probability (0% chance): " + Chance.roll(0.0));

        // Demonstrating the roll method with integer probability (0 - 100)
        System.out.println("\n--- Testing roll(int probability) ---");
        System.out.println("Rolling with 50% probability: " + Chance.roll(50));
        System.out.println("Rolling with 100 probability (100% chance): " + Chance.roll(100));
        System.out.println("Rolling with 0 probability (0% chance): " + Chance.roll(0));

        // Demonstrating the getRandom() method for a random decimal between 0 and 1
        System.out.println("\n--- Testing getRandom() for a decimal between 0 and 1 ---");
        System.out.println("Random decimal between 0 and 1: " + Chance.getRandom());

        // Demonstrating the getRandom(int min, int max) method for a random integer
        System.out.println("\n--- Testing getRandom(min, max) for a random integer in a range ---");
        System.out.println("Random integer between 1 and 10: " + Chance.getRandom(1, 10));
        System.out.println("Random integer between 100 and 200: " + Chance.getRandom(100, 200));

        // Footer
        System.out.println("\n=======================================");
        System.out.println("        End of Demo Program           ");
        System.out.println("=======================================");
    }
}
