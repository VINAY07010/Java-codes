import java.util.Scanner;

public class Q14_Meter_To_Kilometer {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the distance in meters.
        System.out.println("Enter distance in meters: ");
        int meters = Sc.nextInt();

        // Convert meters to kilometers.
       double kilometers = meters  / 1000;

       // Display the result.
        System.out.println("Distance in kilometers is: "+kilometers+"km");
    }
}
