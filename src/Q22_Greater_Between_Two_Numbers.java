import java.util.Scanner;

public class Q22_Greater_Between_Two_Numbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the numbers.
        System.out.println("Enter the first number: ");
        int num1 = Sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = Sc.nextInt();

        // Compare both numbers and find the greater one.
        if(num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 +" is greater.");
        }
    }
}
