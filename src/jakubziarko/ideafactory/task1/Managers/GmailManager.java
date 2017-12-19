package jakubziarko.ideafactory.task1.Managers;

import jakubziarko.ideafactory.task1.*;

public class GmailManager extends TeamManager{

    GmailManager(String name, Role role, String email, String Country, String University, Sex sex){
        super(name,role,email,Country, University, sex);
    }

    @Override
    public boolean canHire(Employee employee) {
        if (employee.getEmail().endsWith("@gmail.com"))
            return true;
        return false;
    }
}
