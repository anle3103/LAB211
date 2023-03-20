package View;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mai Hoa
 */

public class Main {
    public static void main(String[] args) {
        Management mn = new Management();
        List<Student> list = new ArrayList<>();//list danh sách student
        list.add(new Student("123", "Nguyen Van A", 2,"java"));
        list.add(new Student("123", "Nguyen Van A", 1,"java"));
        list.add(new Student("156", "Nguyen Van B", 1,"java"));
        list.add(new Student("172", "Nguyen Van A", 1,".net"));
        list.add(new Student("006", "Nguyen Van D", 1,"java"));
        list.add(new Student("008", "Nguyen Van C", 1,"java"));
        list.add(new Student("010", "Nguyen Thi A", 1,"java"));
        list.add(new Student("101", "Le Van A", 2,"java"));
        list.add(new Student("120", "Tran Van A", 1,"java"));
        list.add(new Student("151", "Le Thi A", 1,"C/C++"));
      //  list.add(new Student("186", "Tan Van C", 1,"java"));
        //menu
        int choice;
        while(true){
            choice = mn.menu();
            if (choice == 5) break;
            switch(choice){
                case 1: 
                    mn.createList(list);
                    break;
                case 2: 
                    mn.findAndSort(list);
                    break;
                case 3:
                    mn.updateOrDelete(list);
                    break;
                case 4:
                    mn.displayReport(list);
                    break;
                case 5: 
                    break;           
            }
        }
            
    }
}
