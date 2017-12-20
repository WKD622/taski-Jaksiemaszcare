package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.*;

public class FemaleManager extends TeamManager{

    FemaleManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getSex() == Sex.female)
            return true;
        return false;
    }
}
