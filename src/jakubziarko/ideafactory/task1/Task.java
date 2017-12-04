package jakubziarko.ideafactory.task1;

public class Task {
    private int unitsOfWork;
    private String work;

    Task(int unitsOfWork, String work){
        this.unitsOfWork=unitsOfWork;
        this.work=work;
    }


    public int getUnitsOfWork() {
        return unitsOfWork;
    }

    public String getInstructionOfWork() {
        return work;
    }

    @Override
    public String toString() {
        return work + "|    unitsOfWork = "+ unitsOfWork;
    }
}
