package jakubziarko.ideafactory.task1;

import jakubziarko.ideafactory.task1.Employees.JuniorDeveloper;
import jakubziarko.ideafactory.task1.Employees.Developer;
import jakubziarko.ideafactory.task1.Managers.AghManager;

public class Program {
    public static void main(String[] args){
        Manager manager = new AghManager("Jakub Ziarko", Role.team_manager, "kuba@gmail.com","Poland","AGH", Sex.male);
        manager.hire(new Developer("Marek Gajęcki",Role.developer, "marek@o2.pl", "Poland", "AGH", Sex.male));
        manager.hire(new Developer("Jarosław Brokuł", Role.developer, "jarek@gmail.com", "Poland", "AGH", Sex.male));
        manager.hire(new JuniorDeveloper("Paweł Zeller", Role.junior_developer, "paweł@gmail.com", "Poland", "AGH", Sex.male));
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