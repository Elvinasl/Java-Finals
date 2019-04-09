package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class RiverIsEmpty extends AnAttraction {
    private DayOfWeek dayOfService = DayOfWeek.SATURDAY;

    public RiverIsEmpty() {
        super(-1, 7, -1, false, true);
    }

    @Override
    public boolean needsService(LocalDate serviceDate) {
        // returns true if given date is saturday
        return serviceDate.getDayOfWeek().equals(dayOfService);
    }

    @Override
    public boolean needsService() {
        // true if today is saturday
        return LocalDate.now().getDayOfWeek().equals(dayOfService);
    }
}
