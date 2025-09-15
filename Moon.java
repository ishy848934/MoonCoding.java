public class MoonTravel {
    public static void main(String[] args) {
        // Distance to the Moon in kilometers
        double distance = 380000;

        // Speed of the rocket in kilometers per second
        double speed = 10;

        // Time in seconds (distance ÷ speed)
        double timeInSeconds = distance / speed;

        // Convert seconds to hours (1 hour = 3600 seconds)
        double timeInHours = timeInSeconds / 3600;

        // Print the result
        System.out.println("It would take about " + timeInHours + " hours to reach the Moon.");
    }
}
