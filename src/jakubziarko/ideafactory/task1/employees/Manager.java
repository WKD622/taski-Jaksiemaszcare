package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.Task;
import jakubziarko.ideafactory.task1.employees.Employee;

public interface Manager extends Employee {
    void hire(Employee employee);
    void fire(Employee employee);
    boolean canHire(Employee employee);
    void giveTask(Task task);
    void getReport();
    String employeesToString();

    public static class ManagerBuilder{

    }
}
