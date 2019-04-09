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
    public LocalDate needsService(LocalDate serviceDate) {
        if(serviceDate.getDayOfWeek().equals(dayOfService)) {
            // its today!
            return serviceDate;
        }
        // returns upcoming monday
        return LocalDate.now().with(TemporalAdjusters.next(dayOfService));
    }
}
