package jakubziarko.ideafactory.task1.employees;

public class PolandManager extends TeamManager{

    PolandManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getCountry() == "Poland")
            return true;
        return false;
    }
}
