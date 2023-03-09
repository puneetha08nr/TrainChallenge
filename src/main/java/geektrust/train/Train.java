package geektrust.train;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private String name;
    private List<Bogie> bogies;

    public Train(String name, ArrayList<Bogie> bogies) {
        this.name = name;
        this.bogies = bogies;
    }

    public String getName() {
        return name;
    }

    public List<Bogie> getBogies() {
        return bogies;
    }

    public void orderOfExistingBogies() {
        bogies.removeIf(Bogie::isBeforeHyderabad);
    }

}