package jakubziarko.ideafactory.task1;

public interface Manager extends Employee {
    void hire(Employee employee);
    void fire(Employee employee);
    boolean canHire(Employee employee);
    void giveTask(Task task);
    void getReport();
    String employeesToString();
}
