package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FloatingPoint extends AnAttraction {


    public FloatingPoint() {
        super(16, -1, -1, false, true);
    }

    @Override
    public LocalDate needsService() {
        return null;
    }
}
