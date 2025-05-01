package JAVA_CHALLENGING_PROBLEMS;

public class Star_Pattern2 {
    int rows;
    
    Star_Pattern2(int r) // PARAMETERIZED CONSTRUCTOR.
    {
        rows = r;
    }
    void printPattern()
    {
        for(int i = rows; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* "); // PRINTING STAR.
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Star_Pattern2 obj = new Star_Pattern2(5);

        // METHOD CALLING.
        obj.printPattern();
    }
}
