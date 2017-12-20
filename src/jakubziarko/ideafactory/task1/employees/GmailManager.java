package jakubziarko.ideafactory.task1.employees;

public class GmailManager extends TeamManager{

    GmailManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getEmail().endsWith("@gmail.com"))
            return true;
        return false;
    }
}
