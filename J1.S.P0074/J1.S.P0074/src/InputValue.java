
import java.util.Scanner;

public class InputValue {
    // input option limit

    public static int InputOptionLimit(int min,int max) {
        // option limit in range [min,max]
        Scanner sc = new Scanner(System.in);
        // loop until input true option
        while (true) {
            try {
                int option = Integer.parseInt(sc.nextLine().trim());
                // if option out of range limit
                if (option < min || option > max) {
                    System.err.println("Out of range input");
                    System.out.print("Enter again:");
                } else {
                    return option;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input");
                System.out.print("Enter again:");
            }

        }
    }
    // input row of matrix

    public static int InputRow(int number) {
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.print("Enter Row Matrix " + number + ":");
        // loop until input true row
        while (true) {
            try {
                row = Integer.parseInt(sc.nextLine());
                if (row < 1) {
                    System.err.println("The row of matrix at least 1");
                    System.out.print("Enter again:");

                } else {
                    return row;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input");
                System.out.print("Enter again:");
            }
        }

    }

    // input column of matrix
    public static int InputColumn(int number) {
        Scanner sc = new Scanner(System.in);
        int column;
        System.out.print("Enter Column Matrix " + number + ":");
        // loop until input true row
        while (true) {
            try {
                column = Integer.parseInt(sc.nextLine());
                if (column < 1) {
                    System.err.println("The column of matrix at least 1");
                    System.out.print("Enter again:");

                } else {
                    return column;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input");
                System.out.print("Enter again:");
            }
        }
    }

    // input value of matrix
    public static int[][] InputValueOfMatrix(int row, int column, int number) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[row][column];
        // loop for travese through row of matrix
        for (int i = 0; i < row; i++) {
            // loop for travese through coloumn of matrix   
            for (int j = 0; j < column; j++) {
                // loop until input true  value of matrix
                while (true) {
                    try {
                        System.out.print("Enter Matrix" + number + "[" + (i + 1) + "]" + "[" + (j + 1) + "]" + ":");
                        matrix[i][j] = Integer.parseInt(sc.nextLine().trim());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Value of matrix is digit");
                    }
                }
            }
        }
        return matrix;
    }
    
}
