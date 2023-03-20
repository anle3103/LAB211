import java.util.*;

public class CalculatorMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        while(true){
            while(true){
                System.out.println("======= Calculator program =======");
                System.out.println("\t1. Addition Matrix");
                System.out.println("\t2. Subtraction Matrix");
                System.out.println("\t3. Multiplication Matrix");
                System.out.println("\t4. Quit");
                System.out.print("Your choice: ");  

                try {
                    c = Integer.parseInt(sc.next());      
                    if(c < 1 || c > 4) throw new Exception();
                    break;
                } catch (Exception e) {
                    System.err.println("You need to choice again (1 - 4).");
                }        
            }
            if(c == 4)  break;   
            
            System.out.println("\nInput matrix 1: ");
            Matrix a = new Matrix();
            a.input();
            System.out.println("Input matrix 2: ");
            Matrix b = new Matrix();
            b.input();

            switch (c) {
                case 1:
                    System.out.println("-----Addition-----");
                    if (a.add(b) == null){
                        System.err.println("Cannot calculation.");
                        break;
                    }
                    else {
                        a.display();
                        System.out.println("+");b.display();
                        System.out.println("=");a.add(b).display();
                        break;
                    }
                case 2:
                    System.out.println("-----Subtraction-----");
                    if (a.sub(b) == null){
                        System.err.println("Cannot calculation.");
                        break;
                    }
                    else {
                        a.display();
                        System.out.println("-");b.display();
                        System.out.println("=");a.sub(b).display();
                        break;
                    }
                case 3:
                    System.out.println("-----Multiplication-----");
                    if (a.multi(b) == null) {
                        System.err.println("Cannot calculation.");
                        break;
                    }
                    else {
                        a.display();
                        System.out.println("*");b.display();
                        System.out.println("=");a.multi(b).display();
                        break;
                    }                       
            }
        }
    }    
          
}
