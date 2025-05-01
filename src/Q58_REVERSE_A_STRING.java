import java.util.Scanner;

public class Q58_REVERSE_A_STRING {

    void Reverse_String(){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = Sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string is: " + reversed);
    }

    public static void main(String[] args) {
        Q58_REVERSE_A_STRING obj = new Q58_REVERSE_A_STRING();
        obj.Reverse_String();
    }
}
