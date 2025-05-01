package JAVA_CHALLENGING_PROBLEMS;

public class Pascal_Triangle {
    int rows;

    // Parameterized constructor to initialize the number of rows
    Pascal_Triangle(int r) {
        rows = r;
    }

    // Method to print Pascal's Triangle
    void printTriangle() {
        for (int i = 0; i < rows; i++) { // Outer loop for rows
            // Print spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            int number = 1; // Initialize the first number in each row
            for (int j = 0; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Create an object of the class with the desired number of rows
        Pascal_Triangle obj = new Pascal_Triangle(5);

        // Call the method to print Pascal's Triangle
        obj.printTriangle();
    }
}