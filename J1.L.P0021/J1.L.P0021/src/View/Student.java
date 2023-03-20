package View;


public class Student {
    private String ID;
    private String name;
    private int Semester;
    private String courseName;
    private int total;

    public Student() {
    }

    public Student(String ID, String name, int Semester, String courseName) {
        this.ID = ID;
        this.name = name;
        this.Semester = Semester;
        this.courseName = courseName;
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    public boolean equals(Student st){
        if(!name.equalsIgnoreCase(st.getName()))
            return false;
        if(Semester != st.getSemester())
            return false;
        if(!courseName.equalsIgnoreCase(st.getCourseName()))
            return false;
        if(!ID.equalsIgnoreCase(st.getID()))
            return false;
        return true;
    }
    public boolean equalNameAndCourse(Student st){
        if(!ID.equalsIgnoreCase(st.getID()))
            return false;
        if(!name.equalsIgnoreCase(st.getName()))
            return false;
        if(!courseName.equalsIgnoreCase(st.getCourseName()))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return  ID + "\t"+ name + "\t\t" + Semester + "\t" + courseName ;
    }
   
    public int getTotal(){
        return total;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public String toReport(){
        return  name + "\t\t" + courseName + "\t\t" + total;
    }
}
