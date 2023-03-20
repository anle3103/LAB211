
import java.util.*;


public class TaskList {

    List<Task> listTask = new ArrayList<>();

    public void setListTask(List<Task> listTask) {
        this.listTask = listTask;
    }
    
    public List<Task> getListTask() {
        return listTask;
    }
    
    // id của task tiep theo
    public int addTask(String reName, String assignee, String expert, 
            String taskTypeID, String date, double planFrom, double planTo) 
    {   
        int id = 0; 
        if(listTask.isEmpty()) 
            id = 1; 
        else
            id = listTask.get(listTask.size() - 1).getId() + 1; 
            listTask.add(new Task(id, reName, taskTypeID, date, planFrom, planTo, assignee, expert)); 
        return id; 
    } 
    
//      cap nhat 1 task
    public void update(Task st, Task t) {
        st.setTaskTypeID(t.getTaskTypeID());
        st.setRequirementName(t.getRequirementName());
        st.setDate(t.getDate());
        st.setAssignee(t.getAssignee());
        st.setReviewer(t.getReviewer());
        st.setTimeFrom(t.getTimeFrom());
        st.setTimeTo(t.getTimeTo());
    }
    
      // tim id trong list
    public int searchId(int id)
    {
        int m = 0, n = listTask.size()-1;
        while (m <= n) {
            int mid = ( m + n ) / 2;
            if (listTask.get(mid).getId() == id)
                return mid;
            if (listTask.get(mid).getId()< id)
                m = mid + 1;
            else
                n = mid - 1;
        }
        return -1;
    }  
    
        // hien thi task
    public void getDataTasks (){
        for (int i = 0; i < listTask.size(); i++) {
            System.out.printf("%-6d%-16s%-16s%-16s%-16.1f%-16s%-16s\n",
                    listTask.get(i).getId(),
                    listTask.get(i).getRequirementName(),
                    listTask.get(i).getTaskType(),
                    listTask.get(i).getDate(),
                    listTask.get(i).getTime(),
                    listTask.get(i).getAssignee(),
                    listTask.get(i).getReviewer());
        }
    }
    
    
}
