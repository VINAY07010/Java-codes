import java.util.Scanner;

public class Q57_TRANSPOSE_OF_MATRIX {

    int[][] matrix;
    int[][] transpose;
    int rows;
    int columns; 
    int i;
    int j;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter number of rows.
        System.out.println("Enter number of rows: ");
        rows = Sc.nextInt();

        // Enter number of columns.
        System.out.println("Enter number of columns: ");
        columns = Sc.nextInt();

        matrix = new int[rows][columns];
        transpose = new int[columns][rows];

        System.out.println("Enter elements of the matrix: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                matrix[i][j] = Sc.nextInt();
            }
        }
    }
    void Find_Transpose(){
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
    }
    void Original(){
        System.out.println("Original Matrix: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    void TRANSPOSE(){
        System.out.println("Transpose of the Matrix:");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<columns; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q57_TRANSPOSE_OF_MATRIX obj = new Q57_TRANSPOSE_OF_MATRIX();
        obj.Input();
        obj.Find_Transpose();
        obj.Original();
        obj.TRANSPOSE();
    }
}
