
public class CaculateMatrix {

    // addition matrix
    public void additionMatrix() {
        System.out.println("-------- Addition --------");
        int row1 = InputValue.InputRow(1);
        int column1 = InputValue.InputColumn(1);
        int matrix1[][] = InputValue.InputValueOfMatrix(row1, column1, 1);
        int row2;
        int column2;
        // loop until input true row of matrix 2
        do {
            row2 = InputValue.InputRow(2);
        } while (!CheckInputSizeMatrix2.CheckInputRowMatrix2Addition(row2, row1));
        // loop until input true column of matrix 2
        do {
            column2 = InputValue.InputColumn(2);
        } while (!CheckInputSizeMatrix2.CheckInputColumnMatrix2Addition(column2, column1));
        int matrix2[][] = InputValue.InputValueOfMatrix(row2, column2, 2);
        System.out.println("-------- Result --------");
        // display matrix 1
        // loop for travese through row of matrix
        for (int i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column1; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("+");
        // display matrix 2
        // loop for travese through row of matrix
        for (int i = 0; i < row2; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column2; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("=");
        int MatrixResult[][] = new int[row1][column1];
        // display matrix result
        // loop for travese through row of matrix
        for (int i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column1; j++) {
                MatrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print("[" + MatrixResult[i][j] + "]");
            }
            System.out.println();
        }

    }
    // subtraction matrix

    public void subtractionMatrix() {
        System.out.println("-------- Subtraction --------");
        int row1 = InputValue.InputRow(1);
        int column1 = InputValue.InputColumn(1);
        int matrix1[][] = InputValue.InputValueOfMatrix(row1, column1, 1);
        int row2;
        int column2;
        // loop until input true row of matrix 2
        do {
            row2 = InputValue.InputRow(2);
        } while (!CheckInputSizeMatrix2.CheckInputRowMatrix2Subtraction(row2, row1));
        // loop until input true column of matrix 2
        do {
            column2 = InputValue.InputColumn(2);
        } while (!CheckInputSizeMatrix2.CheckInputColumnMatrix2Subtraction(column2, column1));
        int matrix2[][] = InputValue.InputValueOfMatrix(row2, column2, 2);
        System.out.println("-------- Result --------");
        // display matrix 1
        // loop for travese through row of matrix
        for (int i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column1; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("-");
        // display matrix 2
        // loop for travese through row of matrix
        for (int i = 0; i < row2; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column2; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("=");
        int MatrixResult[][] = new int[row1][column1];
        // display matrix result
        // loop for travese through row of matrix
        for (int i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column1; j++) {
                MatrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print("[" + MatrixResult[i][j] + "]");
            }
            System.out.println();
        }

    }
    
    // multiplication matrix 
    public void multiplicationMatrix() {
        System.out.println("-------- Multiplication --------");
        int row1 = InputValue.InputRow(1);
        int column1 = InputValue.InputColumn(1);
        int matrix1[][] = InputValue.InputValueOfMatrix(row1, column1, 1);
        int row2;
        int column2;
        // loop until input true row of matrix 2
        do {
            row2 = InputValue.InputRow(2);
        } while (!CheckInputSizeMatrix2.CheckInputRowMatrix2Multiplication(row2, column1));
        column2 = InputValue.InputColumn(2);
        int matrix2[][] = InputValue.InputValueOfMatrix(row2, column2, 2);
        System.out.println("-------- Result --------");
        // display matrix 1
        // loop for travese through row of matrix
        for (int i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column1; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("*");
        // display matrix 2
        // loop for travese through row of matrix
        for (int i = 0; i < row2; i++) {
            // loop for travese through column of matrix
            for (int j = 0; j < column2; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("=");
        // after multiply, the matrix result have size :row of matrix 1,column of matrix 2
        int MatrixResult[][] = new int[row1][column2];
        int i, j, k;
        // loop for traverse through row of matrix result
        for (i = 0; i < row1; i++) {
            // loop for traverse through column of matrix result
            for (j = 0; j < column2; j++) {
                MatrixResult[i][j] = 0;
                for (k = 0; k < row2; k++) {
                    MatrixResult[i][j] = MatrixResult[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }

        }
        // display matrix result
        // loop for travese through row of matrix
        for (i = 0; i < row1; i++) {
            // loop for travese through column of matrix
            for (j = 0; j < column2; j++) {
                System.out.print("[" + MatrixResult[i][j] + "]");
            }
            System.out.println();
        }
    }
}
