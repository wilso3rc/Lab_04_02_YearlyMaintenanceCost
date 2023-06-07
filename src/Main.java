// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int springMaintenanceCost = 125;
        int fallMaintenanceCost = 343;
        int summerMaintenanceCost = 231;
        int winterMaintenanceCost = 239;
        int yearlyMaintenanceCost = 0;

        yearlyMaintenanceCost = springMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost + summerMaintenanceCost;
        System.out.println("Based on the seasonal maintenance costs of $" + springMaintenanceCost + ", $" + summerMaintenanceCost + ", $" + winterMaintenanceCost + ", and $" + fallMaintenanceCost + ". The yearly maintenance cost is: $" + yearlyMaintenanceCost);

    }
}