package jakubziarko.ideafactory.task1.Employees;

import jakubziarko.ideafactory.task1.AbstractEmployee;
import jakubziarko.ideafactory.task1.Role;
import jakubziarko.ideafactory.task1.Sex;

public class Developer extends AbstractEmployee {
    public Developer(String name, Role role, String email, String Country, String University, Sex sex){
        super(name,role,email,Country, University, sex);
    }
}
