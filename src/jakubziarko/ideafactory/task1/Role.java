package jakubziarko.ideafactory.task1;

public enum Role {
    developer,
    team_manager,
    junior_developer;

    @Override
    public String toString() {
        switch (this){
            case developer:
                return "Developer";
            case team_manager:
                return "Team manager";
            case junior_developer:
                return "Junior developer";
            default:
                return null;
        }
    }
}
