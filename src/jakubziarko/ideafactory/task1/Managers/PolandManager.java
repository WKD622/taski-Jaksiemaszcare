package jakubziarko.ideafactory.task1.Managers;

import jakubziarko.ideafactory.task1.*;

public class PolandManager extends TeamManager{

    PolandManager(String name, Role role, String email, String Country, String University, Sex sex){
        super(name,role,email,Country, University, sex);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getCountry() == "Poland")
            return true;
        return false;
    }
}
