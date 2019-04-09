package Attractions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JUnity extends AnAttraction {

    private DayOfWeek dayOfService = DayOfWeek.FRIDAY;

    public JUnity() {
        super(6, -1, 135, false, true);
    }

    @Override
    public boolean needsService(LocalDate serviceDate) {
        // returns true if given date is friday
        return serviceDate.getDayOfWeek().equals(dayOfService);
    }

    @Override
    public boolean needsService() {
        // true if today is friday
        return LocalDate.now().getDayOfWeek().equals(dayOfService);
    }
}
