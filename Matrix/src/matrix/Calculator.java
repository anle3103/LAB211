/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author lebin
 */
public class Calculator {
    // add matrix
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] matrixResult = new int[row1][col1];
        int i,j;
        if (row1 != row2 || col1 != col2) { 
            return null; 
        } else {
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];

                }
            }
        }
        return matrixResult;
    }

    // sub matrix
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] matrixResult = new int[row1][col1];
        int i,j;
        if (row1 != row2 || col1 != col2) {
            return null;
        } else {
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return matrixResult;
    }

    //mul matrix
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] matrixResult = new int[row1][col2];
        int i,j,k;
        if (col1 != row2) { 
            return null;
        } else {
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {                   
                    for (k = 0; k < row2; k++) {
                        matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return matrixResult;
        }
    }

    // check and show result
    void addMatrixResult(int[][] matrix1, int[][] matrix2) {
        System.out.println("-------------------------------------");

        if (additionMatrix(matrix1, matrix2) == null) {
            System.out.println("2 matrixes can not be added.");
            System.out.println("");
        } else {
            System.out.println("------Your Result------");
            displayMatrix(matrix1);
            System.out.println("+");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(additionMatrix(matrix1, matrix2));
        }
    }
    
    // check and show result
    void subMatrixResult(int[][] matrix1, int[][] matrix2) {
        System.out.println("-------------------------------------");
        if (subtractionMatrix(matrix1, matrix2) == null) {
            System.out.println("2 matrixes can not be subtracted.");
            System.out.println("");
        } else {
            System.out.println("------Your Result------");

            displayMatrix(matrix1);
            System.out.println("-");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(subtractionMatrix(matrix1, matrix2));
        }
    }
    // check and show result

    void multipleMatrixResult(int[][] matrix1, int[][] matrix2) {
        System.out.println("-------------------------------------");
        if (multiplicationMatrix(matrix1, matrix2) == null) {
            System.out.println("2 matrixes can not be multiplied.");
            System.out.println("");
        } else {
            System.out.println("------Your Result------");
            displayMatrix(matrix1);
            System.out.println("*");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(multiplicationMatrix(matrix1, matrix2));
        }
    }

    void displayMatrix(int[][] result) {
        int row = result.length;
        int col = result[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + result[i][j] + "]");
            }
            System.out.println();
        }
    }
}
