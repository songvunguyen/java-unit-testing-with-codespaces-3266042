import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = {"Monday", "Tuesday"};
        assertArrayEquals(expected, hairSalon.getOpeningDays());
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("hi"));

        String expected = "Please enter valid date";

        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

}