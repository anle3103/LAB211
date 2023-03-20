
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Performfuntions {

    UserInput val = new UserInput();
    ArrayList<Employee> elist = new ArrayList<>();
    public File file = new File("data.txt");

    //Find and return the data location of the data to be searched in the Database
    public int findExistID(int id) {
        for (int i = 0; i < elist.size(); i++) {
            if (elist.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //Step 1:display menu option
    public int menu() {
        //Hien thi menu
        System.out.println("==========================================================================");
        System.out.println("1. Add employees \n"
                + "2. Update employees\n"
                + "3. Remove employees\n"
                + "4. Search employees\n"
                + "5. Sort employees by salary\n"
                + "6. Exit");

        System.out.println("==========================================================================");
        System.out.println("Please choice one option: ");
        // yeu cau nguoi dung chon tu 1 den 6
        int i = val.getInt(1, 6);
        return i;
    }

    public void writeToFile(File file) {
        try {
            FileWriter fw = new FileWriter(file);
            String newString;
            String result = new String("");
            for (Employee employeeList : elist) {
                newString = employeeList.getId() + ";" + employeeList.getFirstName()
                        + ";" + employeeList.getLastName()
                        + ";" + employeeList.getPhone() + ";" + employeeList.getEmail()
                        + ";" + employeeList.getAddress() + ";" + employeeList.getDob()
                        + ";" + employeeList.getGender() + ";" + employeeList.getSalary()
                        + ";" + employeeList.getAgency() + "\n";
                result = result + newString;
            }
            fw.write(result);
            fw.close();

        } catch (Exception e) {
            System.out.println("Error while writing to the file!");
        }
    }

    
    public ArrayList<Employee> readToFile(File file) {

        try {
            FileReader fw = new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);
            String line = "";
            while (true) {
                line = bw.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                int id = Integer.parseInt(txt[0]);
                String firstName = txt[1];
                String lastName = txt[2];
                String phone = txt[3];
                String email = txt[4];
                String address = txt[5];
                String dob = txt[6];
                String gender = txt[7];
                double salary = Double.parseDouble(txt[8]);
                String agency = txt[9];
                Employee tmp = new Employee(id, firstName, lastName, phone, email, address, dob, gender, salary, agency);
                if(findExistID(id)!= -1)
                {
                    continue;
                }
                elist.add(tmp);
            }   
           

        } catch (Exception e) {
            
        }
        return elist;
    }

    //Step 2: Add employees 
    public void addEmployee() {
         readToFile(file);
        System.out.println("--------------- Add Employee ---------------");
        int id;
        do {
            System.out.println("Enter ID: ");
            id = val.getInt(0, Integer.MAX_VALUE);
            if (findExistID(id) >= 0) {
                System.out.println("This ID is already exist!");
            } else {
                break;
            }
        } while (true);

        System.out.println("Enter first name: ");
        String firstName = val.getString();
        System.out.println("Enter last name: ");
        String lastName = val.getString();
        System.out.println("Enter phone name: ");
        String phone = val.getPhoneNumber();
        System.out.println("Enter email: ");
        String email = val.getEmail();
        System.out.println("Enter address: ");
        String address = val.getString();
        System.out.println("Enter date of birth (dd/MM/yyyy): ");
        String dob = val.GetDate();
        System.out.println("Enter gender (Male/Female): ");
        String gender = val.GetGender();
        System.out.println("Enter salary: ");
        double salary = val.getDouble(0, Double.POSITIVE_INFINITY);
        System.out.println("Enter agency: ");
        String agency = val.getString();
        elist.add(new Employee(id, firstName, lastName, phone, email, address, dob, gender, salary, agency));
        System.out.println("Add Successfull!!");
        writeToFile(file);

    }

    //Step 3: Update employees
    public void updateEmployee() {
        readToFile(file);
        System.out.println("--------------- Add Employee ---------------");
        int id;
        int index;
        //check exit ID 
        do {
            System.out.println("Enter ID: ");
            id = val.getInt(0, Integer.MAX_VALUE);
            index = findExistID(id);
            //Check if the code is duplicate or not
            if (index >= 0) {
                break;
            } else {
                System.out.println("This ID isn't exist!");
            }
        } while (true);
        //update new ID
        System.out.println("DO you want update ID,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter new ID: ");
                do {
                    int newid = val.getInt(0, Integer.MAX_VALUE);

                    if (findExistID(newid) >= 0) {
                        System.out.println("Duplicate! ENter new ID:");
                    } else {
                       elist.get(index).setId(newid);    
                        break;
                    }
                } while (true);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);


        //update first name:       
        System.out.println("DO you want update first name,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter first name: ");
                String firstName = val.getString();
                elist.get(index).setFirstName(firstName);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);
        //update last name:
        System.out.println("DO you want update last name,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter last name: ");
                String lastName = val.getString();
                elist.get(index).setLastName(lastName);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);
        //update phone name:
        System.out.println("DO you want update phone name:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter phone name: ");
                String phone = val.getPhoneNumber();
                elist.get(index).setPhone(phone);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);
        //update email:
        System.out.println("DO you want update email:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter email: ");
                String email = val.getEmail();
                elist.get(index).setEmail(email);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);
        //update address:
        System.out.println("DO you want update address:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter address: ");
                String address = val.getString();
                elist.get(index).setAddress(address);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);

        //update date of birth:
        System.out.println("DO you want update date of birth:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter date of birth (dd/MM/yyyy): ");
                String dob = val.GetDate();
                elist.get(index).setDob(dob);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);

        //update gender
        System.out.println("DO you want update gender:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter gender (Male/Female): ");
                String gender = val.GetGender();
                elist.get(index).setGender(gender);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);

        //update salary
        System.out.println("DO you want update salary:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter salary: ");
                double salary = val.getDouble(0, Double.POSITIVE_INFINITY);
                elist.get(index).setSalary(salary);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);

        //update  agency
        System.out.println("DO you want update agency:,plz enter Y/N:");
        do {
            String continues = val.getString();
            if (continues.equalsIgnoreCase("Y")) {
                System.out.println("Enter agency: ");
                String agency = val.getString();
                elist.get(index).setAgency(agency);
            } else {
                if (continues.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (false);

        System.out.println("Update Successfull!!");
        writeToFile(file);
    }

    //Step 4: Remove employee
    public void removeEmployee() {
         readToFile(file);
        System.out.println("--------- Delete Employee -------");
        System.out.println("Enter ID: ");
        //declare the location
        int index;
        int id = val.getInt(0, Integer.MAX_VALUE);
        //check the location of the code just entered in the database
        index = findExistID(id);
        //Check if the code has data in the database or not
        //if you can wait to update
        //if you don't have time to re-enter
        if (index >= 0) {
            elist.remove(index);
            writeToFile(file);
        } else {
            System.out.println("This code doesn't exist!");
        }
       
    }

    //Step 5: Search employees
    public void searchEmployee() {
        readToFile(file);
        System.out.println("--------- Search Employee -------");
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        int flag = 0;
        System.out.printf("%-20s%-20s%-20s%-20s%-23s%-20s%-20s%-20s%-20s%-20s\n", "ID", "First Name", "Last Name", "Phone", "Email", "Address", "DOB", "Sex", "Salary", "Agency");
        if (text.isEmpty()) {
            for (int i = 0; i < elist.size(); i++) {
                elist.get(i).display();
            }   
        } else {
            for (int i = 0; i < elist.size(); i++) {
                if (elist.get(i).getFirstName().toLowerCase().contains(text)
                        || elist.get(i).getLastName().toLowerCase().contains(text)) {
                    elist.get(i).display();
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("No result!");
            }
        }
    }

    //Step 6: Sort employees by salary
    public void sortEmployeeBySalary() {
        readToFile(file);
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "ID", "First Name", "Last Name", "Phone", "Email", "Address", "DOB", "Sex", "Salary", "Agency");
        Collections.sort(elist);
        for (Employee e : elist) {
            e.display();
        }
    }

}
