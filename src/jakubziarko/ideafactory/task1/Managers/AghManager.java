package jakubziarko.ideafactory.task1.Managers;

import jakubziarko.ideafactory.task1.*;

public class AghManager extends TeamManager{

    public AghManager(String name, Role role, String email, String Country, String University, Sex sex){
        super(name,role,email,Country, University, sex);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getUniversity() == "AGH" )
            return true;
        return false;
    }
}
