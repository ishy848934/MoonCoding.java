public class MoonWaterCalculation {
    public static void main(String[] args) {
        // Constants
        double r_km = 1731; // Moon radius in km
        double r_m = r_km * 1000; // convert to meters
        double thickness = 0.001; // 1 mm in meters
        double density = 3000; // kg/m^3
        double waterFraction = 0.25; // 25% of surface has water

        // Part 1: Volume of 1 mm thick surface layer
        double surfaceArea = 4 * Math.PI * Math.pow(r_m, 2);
        double volumeLayer = surfaceArea * thickness;
        System.out.printf("Volume of 1 mm layer: %.2e m^3%n", volumeLayer);

        // Part 2: Mass of regolith in metric tons
        double massKg = volumeLayer * density;
        double massTons = massKg / 1000; // convert to metric tons
        System.out.printf("Mass of regolith: %.2e metric tons%n", massTons);

        // Part 3: Water that could be recovered
        double waterMassTons = massTons * waterFraction;
        double waterLiters = waterMassTons * 1000; // 1 metric ton ~ 1000 liters
        System.out.printf("Water that could be recovered: %.2e liters%n", waterLiters);
    }
}


