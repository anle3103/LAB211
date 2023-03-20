import java.util.*;

public class ManageTask {
    TaskList tl = new TaskList();   
    Validate valid = new Validate();
    ValidateUpdate validUp = new ValidateUpdate();
    public int menu() { 
        System.out.println("======= Task Program =======");
        System.out.println("\t1. Add Task");
        System.out.println("\t2. Update Task");
        System.out.println("\t3. Delete Task");
        System.out.println("\t4. Display Task");
        System.out.println("\t5. Exit");
        System.out.print("Enter your choice: ");
        int choice =  valid.inputIntLimit(1, 5);
        return choice;
    }
    public void test() {
        tl.getListTask().add(new Task(1, "Dev program", "1", "12-10-2021", 11.0, 17.0, "Dev", "Lead"));
        tl.getListTask().add(new Task(2, "Test program", "2", "31-05-2021", 8.5, 17.5, "Tester", "Manager"));
        tl.getListTask().add(new Task(3, "Design program", "3", "19-06-2021", 11, 15, "designer", "supervisor"));
        tl.getListTask().add(new Task(4, "Social program ", "4", "27-02-2021", 9.5, 16.5, "Tester", "Manager"));
    }
    
    public void addManaTask(){      
        System.out.print("Requirement Name: ");
        String requireName = valid.inputString();
        System.out.print("Task Type: ");
        String taskTypeID = valid.inputIntLimit(1, 4) + ""; 
        System.out.print("Date: ");
        String date = valid.inputDate();
        System.out.print("From: ");
        double planFrom = valid.inputTimeFrom();
        System.out.print("To: ");
        double planTo = valid.inputTimeTo(planFrom);
        System.out.print("Assignee: ");
        String assignee = valid.inputString();
        System.out.print("Reviewer: ");
        String reviewer = valid.inputString();
        int id = tl.addTask(requireName, assignee, reviewer, taskTypeID, date, planFrom, planTo);
    } 
    
    public void updateManaTask(){
        if (tl.getListTask().isEmpty()){
            System.out.println("Empty.");
            return;
        }
        System.out.print("Find by ID: ");
        int id, index;
        while (true) {            
            id = valid.inputIntLimit(1, tl.getListTask().get (tl.getListTask().size()-1).getId());
            index = tl.searchId(id);
            if (index < 0) 
                System.out.print("ID is not exsit. Enter again: ");
            else break;
        }
        
        System.out.print("Update Requirement Name: ");
        String requireName = validUp.inputString(tl.getListTask().get(index).getRequirementName());
        System.out.print("Update Task Type: ");
        String taskTypeID = validUp.inputIntLimit(tl.getListTask().get(index).getTaskTypeID(), 1, 4);
        System.out.print("Update Date: ");
        String date = validUp.inputDate(tl.getListTask().get(index).getDate()) ;   
        System.out.print("Update Plan From: ");
        double timeFrom = validUp.inputTimeFrom(tl.getListTask().get(index).getTimeFrom());
        System.out.print("Update Plan To: ");
        double timeTo = validUp.inputTimeTo(timeFrom, tl.getListTask().get(index).getTimeTo());
        System.out.print("Update Assignee: ");
        String assignee = validUp.inputString(tl.getListTask().get(index).getAssignee());
        System.out.print("Update Reviewer: ");
        String reviewer = validUp.inputString(tl.getListTask().get(index).getReviewer());       
        
        Task t = new Task(id,requireName,taskTypeID, date, timeFrom, timeTo , assignee,reviewer);       
        tl.update (tl.getListTask().get(index), t);
    }
    
    public void deleteManaTask(){
        if (tl.getListTask().isEmpty()){
            System.out.println("Empty.");
            return;
        }           
        System.out.print("Find by ID: ");
        int id, ind;
        while (true) {            
            id = valid.inputIntLimit(1, tl.getListTask().get (tl.getListTask().size()-1).getId());
            ind = tl.searchId( id);
            if (ind < 0) 
                System.out.println("ID is not exsit. Enter again: ");
            else break;
        }
        tl.getListTask().remove(ind);
    }
    
    public void displayTask(){
        if (tl.getListTask().isEmpty()){
            System.out.println("Empty.");
            return;
        }
        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.printf("%-6s%-16s%-16s%-16s%-16s%-16s%-16s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        tl.getDataTasks();
    }
}
