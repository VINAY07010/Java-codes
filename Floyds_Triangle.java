package JAVA_CHALLENGING_PROBLEMS;

public class Floyds_Triangle {
    int rows;

    // Parameterized constructor to initialize the number of rows.
    Floyds_Triangle(int r)
    {
        rows = r;

    }
    // Method to print Floyd's triangle.
    void printTriangle()
    {
        int number = 1; 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(number +" ");
                number++; // Increment the number.
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyds_Triangle obj = new Floyds_Triangle(5);
        obj.printTriangle();
    }
}