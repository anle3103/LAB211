
package View;

import View.Validate;
import java.util.*;

public class StudenList {
    
    // tim index cua 1 sv
    public int indexOfSt(List<Student> list, Student st){
        for (int i = 0; i < list.size(); i++) {
            if (st.equals(list.get(i))){
                return i;
            }    
        }
        return -1;
    }
    // student trung nhau 
    public boolean checkStudent(List<Student> list, Student st){
        for (Student student : list) {
            if (st.getID().equals(student.getID())){
                if (st.equals(student)) 
                    return true;
                else if (!st.getName().toUpperCase().equals(student.getName().toUpperCase()))
                    return true;
            }               
        }
        return false;
    }
  
    // tim list sinh vien theo ten
    public List<Student> findByName(List<Student> list, String s) {
        List<Student> find = new ArrayList<>();
        for (Student student : list) {
            if (student.getName().contains(s))
                find.add(student);            
        }
        if(find.size() == 0) return null;
        return find;
    }
    
    // sap xep list theo ten
    public void sortByName(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        });
    }
    
    // tim bang id
    public List<Student> findByID(List<Student> list, String id) {
        List<Student> find = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equalsIgnoreCase(id)) {
                find.add(list.get(i));
            }
        }
        if(find.size() == 0) return null;
        return find;
    }           
    // update student
    public void update(Student st, Student newSt) {
        st.setID(newSt.getID());
        st.setSemester(newSt.getSemester());
        st.setName(newSt.getName());
        st.setCourseName(newSt.getCourseName());
    }
    // set Name list
    public void setNameList(List<Student> list, String name){
        for (int i = 0; i < list.size(); i++) {          
            list.get(i).setName(name);
        }
    }
    // hien thi list
    public void display(List<Student> list){
        for (int i = 0; i < list.size(); i++) {          
            System.out.printf("%d \t %s\n", i+1 ,list.get(i));
        }
    }
    public void displayReport(List<Student> list){
        for (int i = 0; i < list.size(); i++) {          
            System.out.println(list.get(i).toReport());
        }
    }
    
    // tinh tong course
    public List<Student> totalOfCourse(List<Student> list){    
        int a[] = new int[list.size()];
        List<Student> report = new ArrayList<Student>(list);
        for (int i = 0; i < report.size(); i++) {
            a[i]= 0;
            for (int j = 0; j < report.size(); j++) {
                if(list.get(i).equalNameAndCourse(report.get(j)))
                {
                    a[i]++;
                    report.get(i).setTotal(a[i]);
                }
            }       
        }       
        for (int i = 0; i < report.size(); i++) {
            for (int j = i+1; j < report.size(); j++)
                if(report.get(i).equalNameAndCourse(report.get(j)))
                {
                    report.remove(report.get(j));
                    j--;
                }
        }
        return report;       
    }
}
