package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.Report;
import jakubziarko.ideafactory.task1.Role;
import jakubziarko.ideafactory.task1.Sex;
import jakubziarko.ideafactory.task1.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee implements Employee {
    protected Role role;
    protected String name;
    protected String university;
    protected Sex sex;
    protected String email;
    protected String country;
    protected List<Task> tasks = new ArrayList<>();

    protected AbstractEmployee(EmployeeBuilder builder) {
        this.role = builder.role;
        this.name = builder.name;
        this.sex = builder.sex;
        this.university = builder.university;
        this.email = builder.email;
        this.country = builder.country;
    }

    @Override
    public String getUniversity() {
        return university;
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
    public String getCountry() { return country; }

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

    public static class EmployeeBuilder {
        private final String name;
        private Role role;
        private String university;
        private Sex sex;
        private String email;
        private String country;

        public EmployeeBuilder(String name) {
            this.name = name;
        }

        public EmployeeBuilder role(Role role) {
            this.role = role;
            return this;
        }

        public EmployeeBuilder university(String university) {
            this.university = university;
            return this;
        }

        public EmployeeBuilder sex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Developer buildDeveloper(){
            return new Developer(this);
        }

        public JuniorDeveloper buildJuniorDeveloper(){
            return new JuniorDeveloper(this);
        }

        public AghManager buildAghManager(){
            return new AghManager(this);
        }
    }
}
