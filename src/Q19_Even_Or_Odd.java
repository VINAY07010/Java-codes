import java.util.Scanner;

public class Q19_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();

        // Check if the number is even or odd.
        if(num % 2 == 0) {
            System.out.println(num+" is an Even number.");
        } else {
            System.out.println(num+" is an Odd number.");
        }
    }
}
