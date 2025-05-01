package JAVA_CHALLENGING_PROBLEMS;

public class Hollow_Square_Pattern {
    int size;

    Hollow_Square_Pattern(int s)
    {
        size = s;
    }
    void printPattern()
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if (i == 1 || i == size || j == 1 || j == size)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Square_Pattern obj = new Hollow_Square_Pattern(5);
        obj.printPattern();
    }
}
