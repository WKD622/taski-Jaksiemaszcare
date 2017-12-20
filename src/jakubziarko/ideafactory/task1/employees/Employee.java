package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.Report;
import jakubziarko.ideafactory.task1.Role;
import jakubziarko.ideafactory.task1.Sex;
import jakubziarko.ideafactory.task1.Task;

public interface Employee {

    Role getRole();
    String getName();
    void assign(Task task);
    Report reportWork();
    boolean equals(Employee employee);
    int countAllUnitsOfWork();
    public String getUniversity();
    public Sex getSex();
    public String getEmail();
    public String getCountry();
}
