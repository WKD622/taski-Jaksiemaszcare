package jakubziarko.ideafactory.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee implements Employee {
    protected Role role;
    protected String name;
    protected List<Task> tasks = new ArrayList<>();
    protected String University;
    protected Sex sex;
    protected String email;
    protected String Country;

    protected AbstractEmployee(String name, Role role, String email, String Country, String University, Sex sex) {
        this.role = role;
        this.name = name;
        this.sex = sex;
        this.University = University;
        this.email = email;
        this.Country = Country;
    }

    @Override
    public String getUniversity() {
        return University;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCountry() { return Country; }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void assign(Task task) {
        tasks.add(task);
    }

    @Override
    public Report reportWork() {
        Report report = new Report();
        for (int i = 0; i < tasks.size() - 1; i++) {
            report.addDoneWork(tasks.get(i).getUnitsOfWork(), tasks.get(i).getInstructionOfWork());
        }
        return report;
    }

    @Override
    public String toString() {
        return role.toString() + "   " + name;
    }

    @Override
    public boolean equals(Employee employee) {
        if (this.getName() == employee.getName() && this.getRole() == employee.getRole()) return true;
        return false;
    }

    @Override
    public int countAllUnitsOfWork() {
        int allUnitsOfWork = 0;
        for (Task task : tasks) {
            allUnitsOfWork = allUnitsOfWork + task.getUnitsOfWork();
        }
        return allUnitsOfWork;
    }

}