package jakubziarko.ideafactory.task1;

import jakubziarko.ideafactory.task1.employees.*;

public class Program {
    public static void main(String[] args){
        Manager manager = new AbstractEmployee.EmployeeBuilder("Marek Gajęcki").email("asdf").sex(Sex.male).role(Role.team_manager).country("Poland").university("AGH").buildAghManager();
        manager.hire(new AbstractEmployee.EmployeeBuilder("Jakub Ziarko").email("kuba@gmail").sex(Sex.male).role(Role.developer).country("Poland").university("AGH").buildDeveloper());
        manager.giveTask(new Task(8,"kupić bulki"));
        manager.giveTask(new Task(2,"kupić mleko"));
        manager.giveTask(new Task(6,"wynieść śmieci"));
        manager.giveTask(new Task(7,"umyć kubki"));
        manager.giveTask(new Task(2,"wyszorować umywalki"));
        manager.giveTask(new Task(2,"posprzatać biurka"));
        manager.giveTask(new Task(5,"pomalować płot"));
        manager.giveTask(new Task(3,"wymyc kibelek"));

        manager.getReport();
        System.out.println(manager.employeesToString());
    }
}