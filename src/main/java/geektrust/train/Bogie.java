package geektrust.train;

public class Bogie {

    private String name;

    public Bogie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isBeforeHyderabad() {
        return !StationCode.afterHyderabad().containsKey(name);
    }

    public int distanceAfterHyderabad() {
        return StationCode.afterHyderabad().get(name);
    }
}