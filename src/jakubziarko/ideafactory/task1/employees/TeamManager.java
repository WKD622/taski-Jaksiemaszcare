package jakubziarko.ideafactory.task1.employees;

import jakubziarko.ideafactory.task1.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class TeamManager extends AbstractEmployee implements Manager {
    protected List<Employee> managerEmployees = new ArrayList<>();

    protected TeamManager(EmployeeBuilder builder){
        super(builder);
    }

    @Override
    public void hire(Employee employee) {
        if (canHire(employee)) {
            managerEmployees.add(employee);
        }
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
    public void giveTask(Task task) {
        if (managerEmployees.size() > 0) {
            int mi = 0;
            int minNumberOfTasks = managerEmployees.get(mi).countAllUnitsOfWork();
            for (int i = mi + 1; i < managerEmployees.size(); i++) {
                if (managerEmployees.get(i).countAllUnitsOfWork() < minNumberOfTasks) {
                    mi = i;
                    minNumberOfTasks = managerEmployees.get(i).countAllUnitsOfWork();
                }
            }
            managerEmployees.get(mi).assign(task);
        }
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