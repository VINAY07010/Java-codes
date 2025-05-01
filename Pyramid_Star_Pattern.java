package JAVA_CHALLENGING_PROBLEMS;

public class Pyramid_Star_Pattern {
    int rows;

    // Parameterized constructor to initialize the number of rows
    Pyramid_Star_Pattern(int r) {
        rows = r;
    }

    // Method to print the pyramid star pattern
    void printPattern() {
        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Create an object of the class with the desired number of rows
        Pyramid_Star_Pattern obj = new Pyramid_Star_Pattern(5);

        // Call the method to print the pattern
        obj.printPattern();
    }
}