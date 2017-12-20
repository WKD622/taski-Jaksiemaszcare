package jakubziarko.ideafactory.task1;

import jakubziarko.ideafactory.task1.employees.*;

public class Program {
    public static void main(String[] args){
        Manager manager = new AbstractEmployee.EmployeeBuilder("Marek Gajecki").email("asdf").sex(Sex.male).role(Role.team_manager).country("Poland").university("AGH").buildAghManager();
        manager.hire(new AbstractEmployee.EmployeeBuilder("Pawel Zeller").email("kuba@gmail").sex(Sex.male).role(Role.developer).country("Poland").university("AGH").buildDeveloper());
        manager.hire(new AbstractEmployee.EmployeeBuilder("Jakub Ziarko").email("paweł@gmail.com").sex(Sex.male).role(Role.junior_developer).country("Poland").university("AGH").buildJuniorDeveloper());
        manager.hire(new AbstractEmployee.EmployeeBuilder("Adam Małysz").email("mały@gmail.com").sex(Sex.male).role(Role.developer).country("Poland").university("AGH").buildDeveloper());
        manager.hire(new AbstractEmployee.EmployeeBuilder("Jacek Krzynowek").email("jacus@gmail.com").sex(Sex.male).role(Role.developer).country("Poland").university("AGH").buildDeveloper());

        manager.giveTask(new Task(8,"kupić bulki"));
        manager.giveTask(new Task(2,"kupić mleko"));
        manager.giveTask(new Task(6,"wynieść śmieci"));
        manager.giveTask(new Task(7,"umyć kubki"));
        manager.giveTask(new Task(2,"wyszorować umywalki"));
        manager.giveTask(new Task(2,"posprzatać biurka"));
        manager.giveTask(new Task(5,"pomalować płot"));
        manager.giveTask(new Task(3,"wymyc kibelek"));
        manager.giveTask(new Task(5,"odkurzyc biuro "));
        manager.giveTask(new Task(7,"podlac kwiatki"));

        manager.getReport(2);
        System.out.println(manager.employeesToString());
    }
}