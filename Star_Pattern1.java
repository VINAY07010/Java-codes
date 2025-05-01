package JAVA_CHALLENGING_PROBLEMS;

public class Star_Pattern1 {

    int rows;

    Star_Pattern1(int r) // PARAMETERIZED CONSTRUCTOR.
    {
        rows = r;
    } 
    void printPattern()
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* "); // PRINTING STAR.
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Star_Pattern1 obj = new Star_Pattern1(5); // OBJECT CREATION.

        // METHOD CALLING.
        obj.printPattern();
    }
    
}
