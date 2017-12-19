package jakubziarko.ideafactory.task1;

public enum Sex {
    male,
    female;

    @Override
    public String toString() {
        switch(this){
            case male:
                return "male";
            default:
                return "female";
        }
    }
}

