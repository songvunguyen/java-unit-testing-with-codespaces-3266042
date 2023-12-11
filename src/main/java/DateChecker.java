import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month) {
        return !(month == Month.FEBRUARY || month == Month.APRIL || month == Month.JUNE || month == Month.SEPTEMBER || month == Month.NOVEMBER);
    }

    


}
