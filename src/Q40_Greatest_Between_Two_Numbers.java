import java.util.Scanner;

public class Q40_Greatest_Between_Two_Numbers {

    int num1;
    int num2;
    int greatest;

    void Input() {
        // Enter two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    void Find_Greatest() {
        // Find the greatest number
        greatest = (num1 > num2) ? num1 : num2;
    }

    void Output() {
        // Display the result.
        System.out.println("The greater number is: " + greatest);
    }

    public static void main(String[] args) {
        Q40_Greatest_Between_Two_Numbers obj = new Q40_Greatest_Between_Two_Numbers();
        obj.Input();
        obj.Find_Greatest();
        obj.Output();
    }
}
