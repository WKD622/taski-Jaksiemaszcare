package jakubziarko.ideafactory.task1;

public class Report {
    private int unitsOfWork;
    private String descriptionOfTasksDone;

    public int getUnitsOfWork() {
        return unitsOfWork;
    }

    public Report() {
        unitsOfWork=0;
        descriptionOfTasksDone="";
    }

    @Override
    public String toString() {
        return " | TASKS DONE: " + descriptionOfTasksDone + " | UNITS OF WORK DONE:  " + unitsOfWork;
    }

    public void addDoneWork( int unitsOfWork,String descriptionOfTask){
        this.unitsOfWork=this.unitsOfWork+unitsOfWork;
        this.descriptionOfTasksDone=this.descriptionOfTasksDone + "  " +descriptionOfTask;
    }
}
