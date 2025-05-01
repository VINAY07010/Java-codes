import java.util.Scanner;

public class Q59_PALINDROME {

    void Check_Palindrome(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = Sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Q59_PALINDROME obj = new Q59_PALINDROME();
        obj.Check_Palindrome();
    }
}
