package JAVA_CHALLENGING_PROBLEMS;

public class Number_Pattern {
    int rows;

    // Parameterized constructor to initialize the number of rows
    Number_Pattern(int r) {
        rows = r;
    }

    // Method to print the number pattern
    void printPattern() {
        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(j + " "); // Print the number followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Create an object of the class with the desired number of rows
        Number_Pattern obj = new Number_Pattern(5);

        // Call the method to print the pattern
        obj.printPattern();
    }
}