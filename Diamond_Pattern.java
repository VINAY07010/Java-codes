package JAVA_CHALLENGING_PROBLEMS;

public class Diamond_Pattern {
    int rows;

    // Parameterized constructor to initialize the number of rows
    Diamond_Pattern(int r) {
        rows = r;
    }

    // Method to print the diamond pattern
    void printPattern() {
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Create an object of the class with the desired number of rows
        Diamond_Pattern obj = new Diamond_Pattern(5);

        // Call the method to print the pattern
        obj.printPattern();
    }
}