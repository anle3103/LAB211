
public class CheckInputSizeMatrix2 {
    // check input row matrix 2 when addition 

    public static boolean CheckInputRowMatrix2Addition(int row2, int row1) {
        if (row2 != row1) {
            System.err.println("Row of matrix 2 must be equal to row of matrix 1");
            return false;
        }
        return true;
    }
    // check input column matrix 2 when addition and subtraction

    public static boolean CheckInputColumnMatrix2Addition(int column2, int column1) {
        if (column2 != column1) {
            System.err.println("Column of matrix 2 must be equal to column of matrix 1");
            return false;
        }

        return true;
    }
    
      // check input row matrix 2 when subtraction

    public static boolean CheckInputRowMatrix2Subtraction(int row2, int row1) {
        if (row2 != row1) {
            System.err.println("Row of matrix 2 must be equal to row of matrix 1");
            return false;
        }
        return true;
    }
    // check input column matrix 2 when subtraction

    public static boolean CheckInputColumnMatrix2Subtraction(int column2, int column1) {
        if (column2 != column1) {
            System.err.println("Column of matrix 2 must be equal to column of matrix 1");
            return false;
        }

        return true;
    }

    // check input row  matrix 2 when multiplication
    public static boolean CheckInputRowMatrix2Multiplication(int row2, int column1) {
           if(column1!=row2){
                System.err.println("To multiply, the row of matrix 2 must be equal to column of matrix 1");
                return false;
           }
           return true;
    }

}
