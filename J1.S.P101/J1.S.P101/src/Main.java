
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Performfuntions mn = new Performfuntions();      
        ArrayList<Employee> elist = new ArrayList<>();
        while(true){
            //Step 1:Show menu option   
            int option = mn.menu();
            switch(option){
                case 1: 
                    //Step 2: Add employees 
                    mn.addEmployee();
                    break;
                case 2:
                    //Step 3: Update employees
                    mn.updateEmployee();
                    break;
                case 3:
                    //Step 4: Remove employee
                    mn.removeEmployee();
                    break;
                case 4:
                    //Step 5: Search employees                
                    mn.searchEmployee();
                    break;
                case 5:
                    //Step 6: Sort employees by salary
                    mn.sortEmployeeBySalary();
                    break;
                case 6:
                    //step 7 :exit the program
                    return;
             
            }
        }
    }
    
}
