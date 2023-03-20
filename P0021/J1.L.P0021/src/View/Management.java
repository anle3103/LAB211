package View;

import java.util.*;

public class Management {
    Validate valid = new Validate();
    StudenList sl = new StudenList();
    
    public int menu() { 
        System.out.println("\n==WELCOME TO STUDENT MANAGEMENT==");
        System.out.println("\t1. Create");
        System.out.println("\t2. Find and Sort");
        System.out.println("\t3. Update/Delete");
        System.out.println("\t4. Report");
        System.out.println("\t5. Exit");
        System.out.print("Enter your choice: ");
        int choice =  valid.checkInputIntLimit(1, 5);
        return choice;
    }
    
    public void createList(List<Student> getList){
        while (true) {            
            if(getList.size() < 10) {
                Student st = valid.inputStudent();
                if(sl.checkStudent(getList,st)) System.out.println("Student is exist.");
                else getList.add(st);
            }
            else {
                Student s;
                System.out.println("Do you want to continue (Y/N)?");
                if (valid.checkInputYN()) {
                    s = valid.inputStudent();
                    if(sl.checkStudent(getList,s)) System.out.println("Student is exist.");
                    else getList.add(s);
                }
                else break;
            }                    
        } 
        System.out.println("------------------------");
        sl.display(getList);
    }
    
    public void findAndSort(List<Student> getList){
        if(getList.isEmpty()) {
            System.err.println("Empty.");
            return;
        }
        System.out.print("Find name: ");
        String name = valid.checkInputString();
        List<Student> findList = sl.findByName(getList, name);
        if (findList == null) {
            System.out.println("Student is not exsit.");
        } else {           
            sl.sortByName(findList);
            System.out.println("------------------------");
            sl.display(findList);
        }                     
    }
    public void updateOrDelete(List <Student> getList){
        if(getList.isEmpty()) {
            System.err.println("Empty.");
            return;
        }
        System.out.print("Find student ID: ");
        String id = valid.checkInputString();
        List<Student> findID = sl.findByID(getList, id);
        if (findID.isEmpty()) System.err.println("Student ís not exist.");
        else if(findID.size() == 1){
            sl.display(findID);
            System.out.print("Do you want to update (U) or delete (D) student? ");
            if (valid.checkInputUD())
            {                         
                System.out.print("Update name: ");
                String name = valid.checkInputString();        
                System.out.print("Update semester: ");
                int semester = valid.checkInputIntLimit(0, 9);               
                System.out.print("Update course: ");
                String course = valid.checkCourseName();
                Student newSt = new Student(id, name, semester, course);
                Student x = findID.get(0);
                int inLi = sl.indexOfSt(getList, x);
                sl.update(getList.get(inLi),newSt); 
            }
            else {
                getList.remove(0);
            }  
        }
        else {
            sl.display(findID);
            System.out.print("Index student you chose: ");
            int index = valid.checkInputIntLimit(1, findID.size())-1;
            System.out.print("Do you want to update (U) or delete (D) student? ");
            if (valid.checkInputUD())
            {                             
                System.out.print("Update name: ");
                String name = valid.checkInputString(); 
                System.out.print("Update semester: ");
                int semester = valid.checkInputIntLimit(0, 9);               
                System.out.print("Update course: ");
                String course = valid.checkCourseName();
                Student x = findID.get(index);
                sl.setNameList(findID, name);
                Student newSt = new Student(id, name, semester, course);
                if (sl.checkStudent(getList, newSt)) {
                    System.err.println("Update fail.");
                    return;
                }
                int inLi = sl.indexOfSt(getList, x);
                sl.update(getList.get(inLi),newSt);                 
            }
            else {
                getList.remove(index);
            }  
        }
        System.out.println("------------------------");
        sl.display(getList);
    }
    
    public void displayReport(List<Student> getList){
        if(getList.isEmpty()) {
            System.err.println("Empty.");
            return;
        }
        System.out.println("------------------------");
        List<Student> st = sl.totalOfCourse(getList);
        sl.displayReport(st);
    }
    
}
