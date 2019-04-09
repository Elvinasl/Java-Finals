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
    public LocalDate needsService(LocalDate serviceDate) {
        if(serviceDate.getDayOfWeek().equals(dayOfService)) {
            // its service date!
            return serviceDate;
        }
        // returns upcoming friday
        return LocalDate.now().with(TemporalAdjusters.next(dayOfService));
    }
}
