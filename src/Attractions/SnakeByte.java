package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SnakeByte extends AnAttraction {

    private DayOfWeek dayOfService = DayOfWeek.MONDAY;

    public SnakeByte() {
        super(18, -1, 135, true, false);
    }

    @Override
    public boolean needsService(LocalDate serviceDate) {
        // returns true if given date is monday
        return serviceDate.getDayOfWeek().equals(dayOfService);
    }

    @Override
    public boolean needsService() {
        // true if today is monday
        return LocalDate.now().getDayOfWeek().equals(dayOfService);
    }
}
