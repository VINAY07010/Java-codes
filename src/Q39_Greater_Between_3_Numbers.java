import java.util.Scanner;

public class Q39_Greater_Between_3_Numbers {

    int num1;
    int num2;
    int num3;
    int greatest;

    void Input(){
        // Enter three numbers.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        num1 = Sc.nextInt();
        num2 = Sc.nextInt();
        num3 = Sc.nextInt();
    }
    void Find_Greatest_Number(){
        // Find the greatest number amongst the three numbers.
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
    }
    }
    void Output(){
        // Display the result.
        System.out.println("The greatest number is: " + greatest);
    }

    public static void main(String[] args) {
        Q39_Greater_Between_3_Numbers obj = new Q39_Greater_Between_3_Numbers();
        obj.Input();
        obj.Find_Greatest_Number();
        obj.Output();

    }
}
