package geektrust.train;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TrainTest {

    @Test
    public void expectToReturnRemainingBogies() {
        Bogie bogieOne = new Bogie("KRN");
        Bogie bogieTwo = new Bogie("SLM");
        Bogie bogieThree = new Bogie("GHY");
        ArrayList<Bogie> bogies = new ArrayList<>();
        bogies.add(bogieOne);
        bogies.add(bogieTwo);
        bogies.add(bogieThree);
        Train train = new Train("TRAIN_A", bogies);

        train.orderOfExistingBogies();

        assertEquals(train.getBogies().size(), 1);
    }
}
