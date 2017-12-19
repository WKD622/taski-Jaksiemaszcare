package jakubziarko.ideafactory.task1;

import java.util.List;

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
