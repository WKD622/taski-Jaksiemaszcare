package jakubziarko.ideafactory.task1;

import java.util.ArrayList;
import java.util.List;

public class TeamManager extends AbstractEmployee implements Manager {
    private List<Employee> managerEmployees = new ArrayList<>();

    TeamManager(String name, Role role) {
        this.role=role;
        this.name=name;
    }

    @Override
    public void hire(Employee employee) {
        if (canHire())
            managerEmployees.add(employee);
    }

    @Override
    public void fire(Employee employee) {
        for (int i=0; i<managerEmployees.size(); i++){
            if (managerEmployees.get(i).equals(employee)){
                managerEmployees.remove(i);
                break;
            }
        }
    }

    @Override
    public boolean canHire() {
        if (managerEmployees.size() < 20)
            return true;
        return false;
    }

    @Override
    public void giveTask(Task task) {
        int mi=0;
        int min_number_of_tasks=managerEmployees.get(mi).countAllUnitsOfWork();
        for (int i=mi+1; i<managerEmployees.size(); i++){
            if (managerEmployees.get(i).countAllUnitsOfWork() < min_number_of_tasks){
                mi=i;
                min_number_of_tasks=managerEmployees.get(i).countAllUnitsOfWork();
            }
        }
        managerEmployees.get(mi).assign(task);
    }

    @Override
    public void getReport() {
        System.out.println("RAPORT:");
        for (Employee emp: managerEmployees){
            System.out.println("| EMPLOYEE: " + emp.getName() + emp.reportWork().toString());
        }
    }

    @Override
    public String employeesToString() {
        String empolyeesDescription = "\nEMPLOYEES:";
        for (Employee emp : managerEmployees){
            empolyeesDescription = empolyeesDescription + "\n" + emp.toString();
        }
        return empolyeesDescription;
    }


}