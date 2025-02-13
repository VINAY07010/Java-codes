import java.util.Scanner;

public class Q27_Swap_Two_No {

    int num1,num2;
    int temp;

    void Input(){
        // Enter two numbers.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        num1 = Sc.nextInt();
        num2 = Sc.nextInt();
    }
    void BeforeSwapping(){
        // Display Before Swapping.
        System.out.println("Before Swapping");
        System.out.println("First Number: " +num1);
        System.out.println("Second Number:" +num2);
    }
    void Swap(){
        // Swap two numbers.
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
    void AfterSwapping(){
        // Display After Swapping.
        System.out.println("After Swapping:");
        System.out.println("First Number: " +num1);
        System.out.println("Second Number: " +num2);
    }

    public static void main(String[] args) {
        Q27_Swap_Two_No obj = new Q27_Swap_Two_No();
        obj.Input();
        obj.BeforeSwapping();
        obj.Swap();
        obj.AfterSwapping();
    }
}
