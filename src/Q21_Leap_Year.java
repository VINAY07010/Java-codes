import java.util.Scanner;

public class Q21_Leap_Year {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter a year.
        System.out.println("Enter a year: ");
        int year = Sc.nextInt();

        // Check whether the given year is Leap year or not.
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
