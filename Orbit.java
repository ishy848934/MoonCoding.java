public class LunarOrbit {
    public static void main(String[] args) {
        double horizontal = 2000; // m/s
        double vertical = 3000;   // m/s

        double totalSpeedChange = Math.sqrt(horizontal * horizontal + vertical * vertical);

        System.out.println("Total speed change needed: " + totalSpeedChange + " m/s");
    }
}
