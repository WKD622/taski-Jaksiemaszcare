package jakubziarko.ideafactory.task1;

public class Program {
    public static void main(String[] args){
        TeamManager manager = new TeamManager("Jakub Ziarko", Role.team_manager);
        manager.hire(new Developer("Marek Gajęcki",Role.developer));
        manager.hire(new Developer("Aleksander Kalafior", Role.developer));
        manager.hire(new JuniorDeveloper("Jarosław Gugała", Role.junior_developer));
        manager.giveTask(new Task(8,"kupić bulki"));
        manager.giveTask(new Task(2,"kupić mleko"));
        manager.giveTask(new Task(6,"wynieść śmieci"));
        manager.giveTask(new Task(7,"umyć kubki"));
        manager.giveTask(new Task(2,"wyszorować umywalki"));
        manager.giveTask(new Task(2,"posprzatać biurka"));
        manager.giveTask(new Task(5,"pomalować płot"));

        manager.getReport();
        System.out.println(manager.employeesToString());

        manager.fire(new Developer("Marek Gajęcki",Role.developer));

        System.out.println(manager.employeesToString());

    }
}
