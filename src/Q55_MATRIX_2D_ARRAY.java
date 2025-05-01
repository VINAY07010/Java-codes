import java.util.Scanner;

public class Q55_MATRIX_2D_ARRAY {

    int[][] matrix;
    int rows;
    int columns;
    int i;
    int j;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter number of rows.
        System.out.println("Enter number of rows: ");
        rows = Sc.nextInt();

        // Enter the number of columns.
        System.out.println("Enter the number of columns: ");
        columns = Sc.nextInt();

        matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                matrix[i][j] = Sc.nextInt();
            }
        }
    }
    void Output(){
        System.out.println("The matrix in row-column format: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q55_MATRIX_2D_ARRAY obj = new Q55_MATRIX_2D_ARRAY();
        obj.Input();
        obj.Output();
    }
}
