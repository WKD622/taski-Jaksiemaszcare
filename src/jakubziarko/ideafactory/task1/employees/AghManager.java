package jakubziarko.ideafactory.task1.employees;

public class AghManager extends TeamManager{

    AghManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getUniversity() == "AGH" )
            return true;
        return false;
    }
}
