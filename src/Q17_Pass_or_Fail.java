import java.util.Scanner;

public class Q17_Pass_or_Fail {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the percentage.
        System.out.println("Enter you percentage: ");
        float percentage =  Sc.nextFloat();

        // Check whether the student is pass or fail in examination.
        if(percentage >= 40) {
            System.out.println("Congratulations!, You have passed the exam.");
        } else {
            System.out.println("Sorry, You have failed the exam.");
        }

    }
}
