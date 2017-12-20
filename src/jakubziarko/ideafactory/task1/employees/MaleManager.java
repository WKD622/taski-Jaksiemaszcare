package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.*;

public class MaleManager extends TeamManager{

    MaleManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getSex() == Sex.male)
            return true;
        return false;
    }
}
