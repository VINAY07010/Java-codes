import java.util.Scanner;

public class Q62_LENGTH_OF_A_STRING {

    void Length(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = Sc.nextLine();

        int length = input.length();

        System.out.println("Length of the string is: " + length);
    }

    public static void main(String[] args) {
        Q62_LENGTH_OF_A_STRING obj = new Q62_LENGTH_OF_A_STRING();
        obj.Length();
    }
}
