public class Task {
   private int id; 
   private String taskTypeID, requirementName, date,assignee,reviewer; 
   private double timeFrom, timeTo; 

    public Task() {
    }

    public Task(int id,String requirementName, String taskTypeID, String date, double timeFrom, double timeTo , String assignee, String reviewer) {
        this.id = id;
        this.taskTypeID = taskTypeID;
        this.requirementName = requirementName;
        this.date = date;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTaskTypeID() {
        return taskTypeID;
    }
    
    public void setTaskTypeID(String taskTypeID) {
        this.taskTypeID = taskTypeID;
    }
    
    public String getTaskType(){ 
        int tempTaskTypeID = Integer.parseInt(getTaskTypeID());
        String taskType = ""; 
        switch(tempTaskTypeID){ 
            case 1:
                taskType = "Code"; 
                break; 
            case 2:
                taskType = "Test";
                break; 
            case 3:
                taskType = "Design"; 
                break; 
            case 4:
                taskType = "Review"; 
                break; 
        }
        return taskType;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }
   
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public double getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(double timeFrom) {
        this.timeFrom = timeFrom;
    }
    

    public double getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(double timeTo) {
        this.timeTo = timeTo;
    } 
    
    public double getTime(){
        return getTimeTo()-getTimeFrom();
    }
    @Override
    public String toString() {
        return getId() + "\t"+getRequirementName()+"\t"+ getTaskType()+ "\t" + getTime()+"\t"+getAssignee()+"\t"+getReviewer() ;
    }
    
}
