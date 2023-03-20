package View;


import java.util.*;
import java.util.regex.Pattern;

public class Validate {

    public Validate() {
    }
    
    static Scanner sc = new Scanner(System.in);

    // ktra so trong khoang
    public int checkInputIntLimit(int min, int max) {
        int num;
        while (true) {
            try {                      
                num = Integer.parseInt(sc.nextLine().trim());
                if(num < min || num > max) throw new Exception();
                return num;
            } catch (Exception e) {
                System.err.print("Must be enter number [" + min + " to " + max + "]. Enter again: ");  
            }
        }
    }
    
    // kiem tra chuoi trong
    public String checkInputString() {
        String s = sc.nextLine();
        while (s.trim().isEmpty()) {
            System.err.print("String empty. Enter again: "); 
            s = sc.nextLine().trim();
        }
        return s.trim();
    }
    
    
    // kiem tra chu U or D
    public boolean checkInputUD() {    
        while (true) {
            String s = checkInputString();
            if (s.equalsIgnoreCase("U")) 
                return true;
            if (s.equalsIgnoreCase("D")) 
                return false;          
            System.err.print("Please input u/U or d/D. Enter again: ");
        }
    }  
                    
    //kiem tra Yes No
    public boolean checkInputYN() {
        while (true) {
            String s = checkInputString();
            if (s.equalsIgnoreCase("Y")) 
                return true;
            if (s.equalsIgnoreCase("N")) 
                return false;
            System.err.print("Please input y/Y or n/N. Enter again: ");
        }
    }
    
    // kiem tra khoa hoc
    public String checkCourseName(){
        while (true) {
            String s = checkInputString();
            if (s.equalsIgnoreCase("Java")) 
                return s;
            if (s.equalsIgnoreCase(".Net")) 
                return s;
            if (s.equalsIgnoreCase("C/C++")) 
                return s;
            System.err.print("Please input Java, .Net, C/C++. Enter again: ");
        }
    }

    
    public Student inputStudent() {
        System.out.print("Enter ID: ");
        String id = checkInputString();
        System.out.print("Enter student name: ");
        String name = checkInputString();
        System.out.print("Enter sesmester: ");
        int sesmester = checkInputIntLimit(0, 9);
        System.out.print("Enter course: ");
        String course = checkCourseName();
        Student st = new Student(id, name, sesmester, course);
        return st;
    } 
    
}
    

