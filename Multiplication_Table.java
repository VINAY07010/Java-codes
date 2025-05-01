package JAVA_CHALLENGING_PROBLEMS;

public class Multiplication_Table {
    int range;

    Multiplication_Table(int r) {
        range = r;
    }

    void printTable() {
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.print(i * j + "\t"); // Add a tab for better spacing
            }
            System.out.println(); // Print a new line after each row
        }
    }

    public static void main(String[] args) {
        // Create an object of the class with a range of your choice.
        Multiplication_Table obj = new Multiplication_Table(10);

        // Call the method to print the table.
        obj.printTable();
    }
}