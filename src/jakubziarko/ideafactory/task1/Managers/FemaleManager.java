package jakubziarko.ideafactory.task1.Managers;

import jakubziarko.ideafactory.task1.*;

public class FemaleManager extends TeamManager{

    FemaleManager(String name, Role role, String email, String Country, String University, Sex sex){
        super(name,role,email,Country, University, sex);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getSex() == Sex.female)
            return true;
        return false;
    }
}
