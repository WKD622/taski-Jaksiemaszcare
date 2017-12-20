package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.Task;
import jakubziarko.ideafactory.task1.employees.Employee;

public interface Manager extends Employee {
    void hire(Employee employee);
    void fire(Employee employee);
    boolean canHire(Employee employee);
    void giveTask(Task task);

    /**
     * @param sortVersion
     * 1 - sort by name
     * 2 - sort by units of work done
     * 3 - sort by role
     */
    void getReport(int sortVersion);
    String employeesToString();
}
