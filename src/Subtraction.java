import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1,num2;
        num1=Sc.nextInt();
        num2=Sc.nextInt();

        int sub = num1 - num2;
        System.out.println("Subtraction = "+sub);
    }
}
