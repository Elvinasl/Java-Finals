package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class JUnity extends AnAttraction {

    private DayOfWeek dayOfService = DayOfWeek.FRIDAY;

    public JUnity() {
        super(6, -1, 135, false, true);
    }

    @Override
    public LocalDate needsService(LocalDate serviceDate) {
        if(serviceDate.getDayOfWeek().equals(dayOfService)) {
            // its today!
            return LocalDate.now();
        }
        // returns upcoming friday
        return LocalDate.now().with(TemporalAdjusters.next(dayOfService));
    }
}
