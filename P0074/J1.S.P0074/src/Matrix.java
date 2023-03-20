
import java.util.*;

public class Matrix {
    Scanner sc = new Scanner(System.in);
    int m; 
    int n; 
    int[][] a;

    public Matrix() {
    }

    public Matrix(int m, int n) {     
        this.m = m;
        this.n = n;
        a = new int[m][n];      
    }
    public int validate(){    
        int c;
        while(true){
            try {
                c = Integer.parseInt(sc.next());
                if(c <= 0) throw new Exception();
                return c;
            } catch (Exception e) {
                System.out.print("Enter row matrix again: ");
            }
        }
    }
    
    public void input(){      
        System.out.print("Enter row matrix: ");
        m = validate();
        System.out.print("Enter column matrix: ");       
        n = validate();
        a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {          
                while(true){
                    try {
                        System.out.print("Enter matrix [" + (i + 1) + "][" + (j + 1) + "]: ");
                        a[i][j] = Integer.parseInt(sc.next());
                        break;
                    } catch (Exception e) {
                        System.out.println("Values of matrix must be the number");
                        sc.nextLine();
                    }
                }
            }
        }
    }

    // Hien thi ma tran
    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j]+ "]");
            }
            System.out.println();
        }
    }

    // Cong 2 ma tran
    public Matrix add(Matrix b) {
        if( m != b.m || n != b.n) return null;
        Matrix c = new Matrix(m, n);       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c.a[i][j] = a[i][j] + b.a[i][j];
            }
        }
        return c;
    }

    // Tru 2 ma tran
    public Matrix sub(Matrix b) {
        if( m != b.m || n != b.n) return null;
        Matrix c = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c.a[i][j] = a[i][j] - b.a[i][j];
            }
        }
        return c;
    }

    // Nhan 2 ma tran
    public Matrix multi(Matrix b) {
        Matrix c = new Matrix(m, b.n);    
        if( n != b.m) return null;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b.n; j++) {
                c.a[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c.a[i][j] += a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }
}