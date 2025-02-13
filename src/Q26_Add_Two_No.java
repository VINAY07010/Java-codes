import java.util.Scanner;

public class Q26_Add_Two_No {

    int num1,num2;
    int add;

    void Input(){
        // Enter two numbers.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        num1 = Sc.nextInt();
        num2 = Sc.nextInt();
    }
    void Add(){
        // Add two numbers.
        add = num1 + num2;
    }
    void Output(){
        System.out.println("The Addition of two numbers is : " +add);
    }

    public static void main(String[] args) {
        Q26_Add_Two_No obj = new Q26_Add_Two_No();
        obj.Input();
        obj.Add();
        obj.Output();
    }

}
