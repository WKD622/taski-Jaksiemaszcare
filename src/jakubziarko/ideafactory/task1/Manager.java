package jakubziarko.ideafactory.task1;

public interface Manager extends Employee {
    void hire(Employee employee);
    void fire(Employee employee);
    boolean canHire();
    void giveTask(Task task);
    void getReport();
    String employeesToString();
}
