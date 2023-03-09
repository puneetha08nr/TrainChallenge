package geektrust.train;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BogieTest {
    @Test
    public void expectToReturnTrueIfBeforeHyderabad() {
        Bogie bogie = new Bogie("CHN");

        boolean isBeforeHyderabad = bogie.isBeforeHyderabad();

        assertTrue(isBeforeHyderabad);
    }

    @Test
    public void expectToReturnFalseIfNotBeforeHyderabad() {
        Bogie bogie = new Bogie("GHY");

        boolean isBeforeHyderabad = bogie.isBeforeHyderabad();

        assertFalse(isBeforeHyderabad);
    }

    @Test
    public void testDistanceAfterHyderabad() {
        Bogie bogie = new Bogie("NDL");
        int expectedResult = 1500;

        int isAfterHyderabad = bogie.distanceAfterHyderabad();

        assertEquals(expectedResult, isAfterHyderabad);
    }
}
