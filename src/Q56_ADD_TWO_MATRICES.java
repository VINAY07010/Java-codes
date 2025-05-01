import java.util.Scanner;

public class Q56_ADD_TWO_MATRICES {

    int[][] matrix1;
    int[][] matrix2;
    int[][] result;
    int i;
    int j;
    int rows;
    int columns;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of rows.
        System.out.println("Enter the number of rows: ");
        rows = Sc.nextInt();

        // Enter the number of columns.
        System.out.println("Enter the number of columns: ");
        columns = Sc.nextInt();

        matrix1 = new int[rows][columns];
        matrix2 = new int[rows][columns];
        result = new int[rows][columns];

        System.out.println("Enter the elements of first matrix: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                matrix1[i][j] = Sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                matrix2[i][j] = Sc.nextInt();
            }
        }
    }
    void Add_Matrices(){
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    void Output(){
        System.out.println("The sum of two matrices is: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q56_ADD_TWO_MATRICES obj = new Q56_ADD_TWO_MATRICES();
        obj.Input();
        obj.Add_Matrices();
        obj.Output();
    }
}
