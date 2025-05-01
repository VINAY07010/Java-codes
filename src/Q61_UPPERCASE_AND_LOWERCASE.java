import java.util.Scanner;

public class Q61_UPPERCASE_AND_LOWERCASE {

    void Convert_Case(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = Sc.nextLine();

        String upperCase = input.toUpperCase();
        String lowerCase = input.toLowerCase();

        System.out.println("Upper Case " + upperCase);
        System.out.println("Lower Case " + lowerCase);
    }

    public static void main(String[] args) {
        Q61_UPPERCASE_AND_LOWERCASE obj = new Q61_UPPERCASE_AND_LOWERCASE();
        obj.Convert_Case();
    }
}
