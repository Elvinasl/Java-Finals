package Attractions;

import java.time.DayOfWeek;

public class RiverIsEmpty extends AnAttraction {
    private DayOfWeek dayOfService = DayOfWeek.SATURDAY;

    public RiverIsEmpty() {
        super(-1, 7, -1, false, true);
    }

}
