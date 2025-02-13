import java.util.Scanner;

public class Q28_Square_and_Cube {
    int num;
    int square;
    int cube;

    void Input(){
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Square_And_Cube(){
        // Calculate Square and Cube.
        square = num * num;
        cube = num * num * num;
    }
    void Output(){
        // Display the output.
        System.out.println("The square of given number is: " +square);
        System.out.println("The cube of given number is: " +cube);
    }

    public static void main(String[] args) {
        Q28_Square_and_Cube obj = new Q28_Square_and_Cube();
        obj.Input();
        obj.Square_And_Cube();
        obj.Output();
    }
}
